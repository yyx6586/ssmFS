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
    public UserHomework homeworkSchoolRelease(String account, String gradeclass_id, String title, String subject_name, String homework, String show_teacher, String show_student, String token) throws Exception {
        //将信息插入数据库表中
        UserHomework userHomework = new UserHomework();
        userHomework.setAccount(account);
        userHomework.setGradeclass_id(gradeclass_id);
        userHomework.setTitle(title);
        userHomework.setHomework(homework);
        userHomework.setSubject_name(subject_name);
        userHomework.setShow_teacher(show_teacher);
        userHomework.setShow_student(show_student);

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
    public boolean homeworkSchoolDetails(int id, String token) throws Exception {
        //根据 id 删除作业记录
        boolean result = userHomeworkMapper.deleteHomeworkByExample(id);
        return result;
    }

    @Override
    public List<UserHomework> homeworkFamily(String gradeclass_id, Integer curPage, Integer pageSize, String token) throws Exception {
        //根据班级 id 查询作业的信息
        List<UserHomework> list = userHomeworkMapper.selectHomeworkByGrade_id(gradeclass_id, curPage, pageSize);
        return list;
    }

    //  修改数据库里的 showBadge 属性
    @Override
    public void updateHomeworkShowBadge(int id, String show_teacher, String show_student, String token) throws Exception {
        // 检查该通知是否存在
        UserHomework userHomework = userHomeworkMapper.selectByPrimaryKey(id);
        if(userHomework == null){
            new Exception("获取信息错误");
        }

        // 修改 showBadge
        userHomework = new UserHomework();
        userHomework.setId(id);
        userHomework.setShow_teacher(show_teacher);
        userHomework.setShow_student(show_student);

        userHomeworkMapper.updateByPrimaryKeySelective(userHomework);
    }

    // 根据 id 获取作业信息
    @Override
    public UserHomework homeworkById(int id, String token) throws Exception {
        // 检查该通知是否存在
        UserHomework userHomework = userHomeworkMapper.selectByPrimaryKey(id);
        if(userHomework == null){
            new Exception("获取信息错误");
        }

        return userHomework;
    }

    // 根据 id 修改作业信息
    @Override
    public void updateHomework(int id, String title, String homework, String show_teacher,  String token) throws Exception {
        // 检查该作业是否存在
        UserHomework userHomework = userHomeworkMapper.selectByPrimaryKey(id);
        if(userHomework == null){
            new Exception("获取信息错误");
        }

        // 修改 作业 信息
        userHomework = new UserHomework();
        userHomework.setTitle(title);
        userHomework.setId(id);
        userHomework.setHomework(homework);
        userHomework.setShow_teacher(show_teacher);

        userHomeworkMapper.updateByPrimaryKeySelective(userHomework);

    }
}

