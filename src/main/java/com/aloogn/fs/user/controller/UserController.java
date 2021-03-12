package com.aloogn.fs.user.controller;

import com.aloogn.common.utils.JSONUtil;
import com.aloogn.common.utils.StringUtils;
import com.aloogn.fs.redis.service.RedisService;
import com.aloogn.fs.user.bean.AuthUser;
import com.aloogn.fs.user.bean.User;
import com.aloogn.fs.user.service.UserService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

//    @Qualifier("userService")
    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    JSONUtil jsonUtil = new JSONUtil();

    @RequestMapping("/signIn")
    @ResponseBody
    public JSONUtil signIn(String account, String name, String password, HttpServletRequest request) throws Exception {
        jsonUtil.setCode(-1);
        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(name)){
            jsonUtil.setMsg("姓名不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(password)){
            jsonUtil.setMsg("密码不能为空");
            return jsonUtil;
        }

        AuthUser authUser = userService.signIn(account,name,password,request);

        if (authUser.getMsg() != null){
            jsonUtil.setMsg(authUser.getMsg());
            return jsonUtil;
        }

        if (authUser.getUserPassword() == null){
            jsonUtil.setMsg("该用户不存在");
            return jsonUtil;
        }

        if (!authUser.getUserName().equals(name)){
            jsonUtil.setMsg("姓名错误，请重新登录");
            return jsonUtil;
        }

        if (!authUser.getUserPassword().equals(password)){
            jsonUtil.setMsg("密码错误，请重新登录");
            return jsonUtil;
        }

        if (authUser.getUserPassword().equals(password) && authUser.getUserName().equals(name)){
            jsonUtil.setCode(1);
            jsonUtil.setData(authUser);
            jsonUtil.setMsg("登录成功");
        }else {
            jsonUtil.setMsg("姓名或者密码错误，请重新登录");
        }
        return jsonUtil;
    }

    @RequestMapping("/updatePassword")
    @ResponseBody
    public JSONUtil updatePassword(String account, String password, String resetPassword, String token) throws Exception{
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(password)){
            jsonUtil.setMsg("原密码不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(resetPassword)){
            jsonUtil.setMsg("新密码不能为空");
            return jsonUtil;
        }

        try {
            userService.updatePassword(account, password, resetPassword,token);
//            session.setAttribute("USER_SESSION",user);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("密码修改成功");
        }catch (Exception e){
            jsonUtil.setMsg("密码修改错误" + e.getMessage());
        }
        return jsonUtil;
    }

    @RequestMapping("/personalInformationFamily")
    @ResponseBody
    public JSONUtil personalInformationFamily(String account, String studentName, String studentSex, String phone, String QQ, String wechat, String address, String parentName, String parentPhone, String parentQQ, String parentWechat, String parentAddress, String token) throws Exception{
        JSONUtil jsonUtil = new JSONUtil();
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(studentName)){
            jsonUtil.setMsg("学生姓名不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(studentSex)){
            jsonUtil.setMsg("学生性别不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(parentName)){
            jsonUtil.setMsg("家长姓名为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(parentPhone)){
            jsonUtil.setMsg("家长电话不能为空");
            return jsonUtil;
        }

        try {
            userService.personalInformationFamily(account, studentName, studentSex, phone, QQ, wechat, address, parentName, parentPhone, parentQQ, parentWechat, parentAddress, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("保存成功");
        }catch (Exception e){
            jsonUtil.setMsg("保存失败，请重新修改" + e.getMessage());
        }
        return jsonUtil;
    }

    @RequestMapping("/personalInformationSchool")
    @ResponseBody
    public JSONUtil personalInformationSchool(String account, String name, String sex, String phone, String QQ, String wechat, String address, String email, String token) throws Exception{
        jsonUtil.setCode(-1);
        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(name)){
            jsonUtil.setMsg("姓名不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(sex)){
            jsonUtil.setMsg("性别不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(phone)){
            jsonUtil.setMsg("手机号不能为空");
            return jsonUtil;
        }

        try{
            userService.personalInformationSchool(account, name, sex, phone, QQ, wechat, email, address, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("保存成功");
        }catch (Exception e){
            jsonUtil.setMsg("保存失败，请重新修改" + e.getMessage());
        }
        return jsonUtil;
    }

    @RequestMapping("/familyPersonalDetails")
    @ResponseBody
    public JSONUtil familyPersonalDetails(String account, String token) throws Exception{
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号错误，请联系管理员");
            return jsonUtil;
        }

        try {
            User user = userService.familyPersonalDetails(account, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("获取联系人成功");
            jsonUtil.setData(user);
        }catch (Exception e){
            jsonUtil.setMsg("获取联系人错误" + e.getMessage());
        }
        return jsonUtil;
    }

//    @RequestMapping("/findPassword")
//    @ResponseBody
//    public JSONUtil findPassword(String account, HttpServletRequest request){
//        jsonUtil.setCode(-1);
//
//        if(StringUtils.isNullOrEmpty(account)){
//            jsonUtil.setMsg("账号不能为空");
//            return jsonUtil;
//        }
//
//        try {
////            AuthUser authUser = userService.findPassword(account, request);
//
//            List<User> list = userService.findPassword(account, request);
//            if(list.size() > 0){
//                jsonUtil.setCode(1);
//                jsonUtil.setData(list);
//            }else {
//                jsonUtil.setMsg("该用户不存在，请重新输入");
//            }
////            if (authUser.getUserPassword() == null){
////                jsonUtil.setMsg("该用户不存在,请重新输入");
////                return jsonUtil;
////            }else {
////                jsonUtil.setCode(1);
////                jsonUtil.setData(authUser);
////            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return jsonUtil;
//    }
}
