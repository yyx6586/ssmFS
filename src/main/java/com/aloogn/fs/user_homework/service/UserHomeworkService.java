package com.aloogn.fs.user_homework.service;

import com.aloogn.fs.user_homework.bean.UserHomework;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserHomeworkService {
    UserHomework homeworkSchoolRelease(String account, String gradeclass_id, String title, String subject_name, String homework, String show_teacher, String show_student, String token) throws Exception;

    List<UserHomework> homeworkSchoolAreledy(String account, String token) throws Exception;

    boolean homeworkSchoolDetails (int id, String token) throws Exception;

    List<UserHomework> homeworkFamily(String gradeclass_id, Integer curPage, Integer pageSize, String token) throws Exception;

    //  修改数据库里的 showBadge 属性
    void updateHomeworkShowBadge(int id, String show_teacher, String show_student, String token) throws Exception;

    // 根据 id 获取作业信息
    UserHomework homeworkById(int id, String token) throws Exception;

    // 根据 id 修改作业信息
    void updateHomework(int id, String title, String homework, String show_teacher, String token) throws Exception;
}

