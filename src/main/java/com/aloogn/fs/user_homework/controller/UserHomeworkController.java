package com.aloogn.fs.user_homework.controller;

import com.aloogn.common.utils.JSONUtil;
import com.aloogn.common.utils.StringUtils;
import com.aloogn.fs.user_homework.bean.UserHomework;
import com.aloogn.fs.user_homework.service.UserHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/userHomework")
public class UserHomeworkController {

    @Autowired
    UserHomeworkService userHomeworkService;

    JSONUtil jsonUtil = new JSONUtil();

    @RequestMapping("/homeworkSchoolRelease")
    @ResponseBody
    public JSONUtil homeworkSchoolRelease(String account, String grade_id, String subject_name, String homework, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号信息错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(grade_id)){
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
            userHomeworkService.homeworkSchoolRelease(account, grade_id, subject_name, homework, token);
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
    public JSONUtil homeworkSchoolDetails(String account, String grade_id, String homework, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号信息错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(grade_id)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(homework)){
            jsonUtil.setMsg("发布作业信息不能为空");
            return jsonUtil;
        }

        try{
            boolean result = userHomeworkService.homeworkSchoolDetails(account, grade_id, homework, token);
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
    public JSONUtil homeworkFamily(String grade_id, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(grade_id)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        try{
            List<UserHomework> list = userHomeworkService.homeworkFamily(grade_id, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("获取作业信息成功");
            jsonUtil.setData(list);
        } catch (Exception e) {
            jsonUtil.setMsg("获取作业信息失败，请重新登录" + e.getMessage());
        }
        return jsonUtil;
    }
}

