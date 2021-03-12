package com.aloogn.fs.grade.controller;


import com.aloogn.common.utils.JSONUtil;
import com.aloogn.common.utils.StringUtils;
import com.aloogn.fs.grade.bean.Grade;
import com.aloogn.fs.grade.service.GradeService;
import com.aloogn.fs.user_grade.bean.UserGrade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    GradeService gradeService;

    JSONUtil jsonUtil = new JSONUtil();

    //根据班级与年级名称查询班级与年级的 id
    @RequestMapping("/gradeClassId")
    @ResponseBody
    public JSONUtil gradeClassId(String grade_name, String class_name, String token){
        if(StringUtils.isNullOrEmpty(grade_name)){
            jsonUtil.setMsg("年级不能为空");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(class_name)){
            jsonUtil.setMsg("班级不能为空");
            return jsonUtil;
        }

        try{
            Grade grade = gradeService.gradeClassId(grade_name, class_name, token);
            jsonUtil.setData(grade);
        } catch (Exception e) {
            jsonUtil.setMsg("获取数据错误，请重新获取" + e.getMessage());
        }
        return jsonUtil;
    }

    //根据班级与年级名称查询班级与年级的 id
    @RequestMapping("/gradeClassName")
    @ResponseBody
    public JSONUtil gradeClassName(String gradeclass_id, String token){
        if(StringUtils.isNullOrEmpty(gradeclass_id)){
            jsonUtil.setMsg("id不能为空");
            return jsonUtil;
        }

        try{
            Grade grade = gradeService.gradeClassName(gradeclass_id, token);
            jsonUtil.setData(grade);
        } catch (Exception e) {
            jsonUtil.setMsg("获取数据错误，请重新获取" + e.getMessage());
        }
        return jsonUtil;
    }
}
