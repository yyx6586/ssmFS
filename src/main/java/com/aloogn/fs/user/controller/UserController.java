package com.aloogn.fs.user.controller;

import com.aloogn.common.utils.JSONUtil;
import com.aloogn.common.utils.StringUtils;
import com.aloogn.fs.redis.service.RedisService;
import com.aloogn.fs.user.bean.AuthUser;
import com.aloogn.fs.user.bean.User;
import com.aloogn.fs.user.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Qualifier("userService")
    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/signIn")
    @ResponseBody
    public JSONUtil signIn(String account, String password, HttpServletRequest request) throws Exception {
        JSONUtil jsonUtil = new JSONUtil();
        jsonUtil.setCode(-1);
        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(password)){
            jsonUtil.setMsg("密码不能为空");
            return jsonUtil;
        }

        AuthUser authUser = userService.signIn(account,password,request);

        if (authUser.getUserPassword() == null){
            jsonUtil.setMsg("该用户不存在");
            return jsonUtil;
        }

        if (authUser.getUserPassword().equals(password)){
            jsonUtil.setCode(1);
            jsonUtil.setData(authUser);
            jsonUtil.setMsg("登录成功");
        }else {
            jsonUtil.setMsg("密码错误，请重新登录");
        }
        return jsonUtil;
    }

    @RequestMapping("/updatePassword")
    @ResponseBody
    public JSONUtil updatePassword(String account, String password, String resetPassword, String token) throws Exception{
        JSONUtil jsonUtil = new JSONUtil();
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("原密码不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(password)){
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
    public JSONUtil personalInformationFamily(String account, String studentName, String studentSex, String parentName, String parentPhone, String token) throws Exception{
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
            userService.personalInformationFamily(account, studentName, studentSex, parentName, parentPhone, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("保存成功");
        }catch (Exception e){
            jsonUtil.setMsg("保存失败，请重新修改" + e.getMessage());
        }
        return jsonUtil;
    }
}
