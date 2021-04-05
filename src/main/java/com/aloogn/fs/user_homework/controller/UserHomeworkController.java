package com.aloogn.fs.user_homework.controller;

import com.aloogn.common.utils.JSONUtil;
import com.aloogn.common.utils.StringUtils;
import com.aloogn.fs.user_homework.bean.UserHomework;
import com.aloogn.fs.user_homework.service.UserHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/userHomework")
@CrossOrigin("*")      //允许跨域请求
public class UserHomeworkController {

    @Autowired
    UserHomeworkService userHomeworkService;

    JSONUtil jsonUtil = new JSONUtil();

    @RequestMapping("/homeworkSchoolRelease")
    @ResponseBody
    public JSONUtil homeworkSchoolRelease(String account, String gradeclass_id, String title, String subject_name, String homework, String show_teacher, String show_student, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号信息错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(gradeclass_id)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(subject_name)){
            jsonUtil.setMsg("科目名称不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(homework)){
            jsonUtil.setMsg("发布作业信息不能为空");
            return jsonUtil;
        }

        try{
            userHomeworkService.homeworkSchoolRelease(account, gradeclass_id, title, subject_name, homework, show_teacher, show_student, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("作业发布成功");
        } catch (Exception e) {
            jsonUtil.setMsg("作业发布失败" + e.getMessage());
        }
        return jsonUtil;
    }

    @RequestMapping("/homeworkSchoolAreledy")
    @ResponseBody
    public JSONUtil homeworkSchoolAreledy(String account, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号信息错误，请联系管理员");
            return jsonUtil;
        }

        try{
            List<UserHomework> list = userHomeworkService.homeworkSchoolAreledy(account, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("获取作业信息成功");
            jsonUtil.setData(list);
        } catch (Exception e) {
            jsonUtil.setMsg("获取作业信息失败,请重新登录" + e.getMessage());
        }
        return jsonUtil;
    }

    @RequestMapping("/homeworkSchoolDetails")
    @ResponseBody
    public JSONUtil homeworkSchoolDetails(int id, String token){
        jsonUtil.setCode(-1);

        try{
            boolean result = userHomeworkService.homeworkSchoolDetails(id, token);
            if(result){
                jsonUtil.setData(1);
                jsonUtil.setMsg("作业删除成功");
            }else {
                jsonUtil.setMsg("作业删除失败，请重新删除");
            }
        } catch (Exception e) {
            jsonUtil.setMsg("作业删除失败，请重新删除" + e.getMessage());
        }
        return jsonUtil;
    }

    @RequestMapping("/homeworkFamily")
    @ResponseBody
    public JSONUtil homeworkFamily(String gradeclass_id, Integer curPage, Integer pageSize, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(gradeclass_id)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        try{
            List<UserHomework> list = userHomeworkService.homeworkFamily(gradeclass_id,curPage, pageSize, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("获取作业信息成功");
            jsonUtil.setData(list);
        } catch (Exception e) {
            jsonUtil.setMsg("获取作业信息失败，请重新登录" + e.getMessage());
        }
        return jsonUtil;
    }

    // 修改数据库里的 showBadge 属性
    @RequestMapping("/updateHomeworkShowBadge")
    @ResponseBody
    public JSONUtil updateHomeworkShowBadge(int id, String show_teacher, String show_student, String token) throws Exception{
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(show_teacher)){
            jsonUtil.setMsg("获取数据错误，请重新点击");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(show_student)){
            jsonUtil.setMsg("获取数据错误，请重新点击");
            return jsonUtil;
        }

        try {
            userHomeworkService.updateHomeworkShowBadge(id, show_teacher, show_student, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("修改成功");
        }catch (Exception e){
            jsonUtil.setMsg("修改错误" + e.getMessage());
        }
        return jsonUtil;
    }

    // 根据 id 获取作业信息
    @RequestMapping("/homeworkById")
    @ResponseBody
    public JSONUtil informationById(int id, String token){
        jsonUtil.setCode(-1);

        try {
            UserHomework userHomework = userHomeworkService.homeworkById(id, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("获取作业成功");
            jsonUtil.setData(userHomework);
        } catch (Exception e) {
            jsonUtil.setMsg("作业查询错误，请重新登录" + e.getMessage());
        }
        return jsonUtil;
    }

    // 根据 id 修改作业信息
    @RequestMapping("/updateHomework")
    @ResponseBody
    public JSONUtil updateInformation(int id, String title, String homework, String show_teacher, String token) throws Exception{
        jsonUtil.setCode(-1);

        try {
            userHomeworkService.updateHomework(id, title, homework, show_teacher, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("作业修改成功");
        }catch (Exception e){
            jsonUtil.setMsg("作业修改错误" + e.getMessage());
        }
        return jsonUtil;
    }
}

