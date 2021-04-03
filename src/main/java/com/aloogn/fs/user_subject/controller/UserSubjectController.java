package com.aloogn.fs.user_subject.controller;

import com.aloogn.common.utils.JSONUtil;
import com.aloogn.common.utils.StringUtils;
import com.aloogn.fs.user_subject.bean.SchoolUserSubject;
import com.aloogn.fs.user_subject.service.UserSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/userSubject")
@CrossOrigin("*")      //允许跨域请求
public class UserSubjectController {

    @Autowired
    UserSubjectService userSubjectService;

    @RequestMapping("/schoolPersonalDetails")
    @ResponseBody
    public JSONUtil SchoolPersonalDetails(String account, String token) throws Exception{
        JSONUtil jsonUtil = new JSONUtil();

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号错误，请联系管理员");
            return jsonUtil;
        }

        try{
            List<SchoolUserSubject> schoolUserSubject = userSubjectService.SchoolPersonalDetails(account, token);
            jsonUtil.setData(schoolUserSubject);
        }catch (Exception e){
            jsonUtil.setMsg("详细信息获取错误，请重新登录" + e.getMessage());
        }
        return jsonUtil;
    }
}
