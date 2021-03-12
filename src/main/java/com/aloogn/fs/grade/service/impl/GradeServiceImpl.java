package com.aloogn.fs.grade.service.impl;

import com.aloogn.fs.grade.bean.Grade;
import com.aloogn.fs.grade.mapper.GradeMapper;
import com.aloogn.fs.grade.service.GradeService;
import com.aloogn.fs.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

public class GradeServiceImpl implements GradeService {

    @Autowired
    GradeMapper gradeMapper;

    @Autowired
    RedisService redisService;

    @Override
    public Grade gradeClassId(String grade_name, String class_name, String token) throws Exception {
        // 根据班级与年级名称查询班级与年级id
        Grade grade = gradeMapper.selectGradeClassByAccount(grade_name, class_name);
        return grade;
    }

    @Override
    public Grade gradeClassName(String gradeclass_id, String token) throws Exception {
        // 根据班级与年级id查询班级与年级名称
        Grade grade = gradeMapper.selectIdByGradeClassName(gradeclass_id);
        return grade;
    }
}
