package com.aloogn.fs.user_homework.service;

import com.aloogn.fs.user_homework.bean.UserHomework;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserHomeworkService {
    UserHomework homeworkSchoolRelease(String account, String grade_id, String subject_name, String homework, String token) throws Exception;

    List<UserHomework> homeworkSchoolAreledy(String account, String token) throws Exception;

    boolean homeworkSchoolDetails (String account, String grade_id, String homework, String token) throws Exception;

    List<UserHomework> homeworkFamily(String grade_id, String token) throws Exception;
}
