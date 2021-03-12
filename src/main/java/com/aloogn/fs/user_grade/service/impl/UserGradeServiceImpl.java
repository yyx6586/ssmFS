package com.aloogn.fs.user_grade.service.impl;

import com.aloogn.fs.grade.bean.Grade;
import com.aloogn.fs.redis.service.RedisService;
import com.aloogn.fs.user.bean.User;
import com.aloogn.fs.user_grade.bean.UserGrade;
import com.aloogn.fs.user_grade.mapper.UserGradeMapper;
import com.aloogn.fs.user_grade.service.UserGradeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserGradeServiceImpl implements UserGradeService {
    @Autowired
    UserGradeMapper userGradeMapper;


    @Autowired
    RedisService redisService;

    @Override
    public List<User> userGrade(String grade_id, String token) throws Exception {
        //查询所在班级的学生
        List<User> list = userGradeMapper.selectUserByExample(grade_id);
        return list;
    }

    @Override
    public UserGrade userClass(String account, String token) throws Exception {
        //根据账号查询学生所在的班级
        UserGrade userGrade = userGradeMapper.selectGradeByAccount(account);
        return userGrade;
    }
}
