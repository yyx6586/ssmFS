package com.aloogn.fs.user_grade.controller;

import com.aloogn.common.utils.JSONUtil;
import com.aloogn.common.utils.StringUtils;
import com.aloogn.fs.grade.bean.Grade;
import com.aloogn.fs.user.bean.User;
import com.aloogn.fs.user_grade.bean.UserGrade;
import com.aloogn.fs.user_grade.service.UserGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/userGrade")
public class UserGradeController {

    @Autowired
    UserGradeService userGradeService;

    JSONUtil jsonUtil = new JSONUtil();

    @RequestMapping("/userTeacher")
    @ResponseBody
    public JSONUtil userTeacher(String grade_id, String token) throws Exception{
        if(StringUtils.isNullOrEmpty(grade_id)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        try{
            List<User> list = userGradeService.userGrade(grade_id, token);
            jsonUtil.setData(list);
        }catch (Exception e){
            jsonUtil.setMsg("获取数据错误" + e.getMessage());
        }
        return jsonUtil;
    }

    @RequestMapping("/userClass")
    @ResponseBody
    public JSONUtil userClass(String account, String token){
        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        try{
            UserGrade userGrade = userGradeService.userClass(account, token);
            jsonUtil.setData(userGrade);
        } catch (Exception e) {
            jsonUtil.setMsg("获取数据错误，请重新登录" + e.getMessage());
        }
        return jsonUtil;
    }
}
