package com.aloogn.fs.user_homework.service.impl;

import com.aloogn.fs.user_homework.bean.UserHomework;
import com.aloogn.fs.user_homework.mapper.UserHomeworkMapper;
import com.aloogn.fs.user_homework.service.UserHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserHomeworkServiceImpl implements UserHomeworkService {
    @Autowired
    UserHomeworkMapper userHomeworkMapper;

    @Override
    public UserHomework homeworkSchoolRelease(String account, String grade_id, String subject_name, String homework, String token) throws Exception {
        //将信息插入数据库表中
        UserHomework userHomework = new UserHomework();
        userHomework.setAccount(account);
        userHomework.setGrade_id(grade_id);
        userHomework.setHomework(homework);
        userHomework.setSubject_name(subject_name);

        //将信息插入表中
        userHomeworkMapper.insertSelective(userHomework);
        return userHomework;
    }

    @Override
    public List<UserHomework> homeworkSchoolAreledy(String account, String token) throws Exception {
        //根据账号查询发布的作业
        List<UserHomework> list = userHomeworkMapper.selectHomeworkByExample(account);
        return list;
    }

    @Override
    public boolean homeworkSchoolDetails(String account, String grade_id, String homework, String token) throws Exception {
        //根据账号、班级、作业，删除作业记录
        boolean result = userHomeworkMapper.deleteHomeworkByExample(account, grade_id, homework);
        return result;
    }

    @Override
    public List<UserHomework> homeworkFamily(String grade_id, String token) throws Exception {
        //根据班级 id 查询作业的信息
        List<UserHomework> list = userHomeworkMapper.selectHomeworkByExample(grade_id);
        return list;
    }
}
