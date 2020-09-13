package com.aloogn.fs.user_grade.service;

import com.aloogn.fs.user.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserGradeService {
    List<User> userGrade(String grade_id, String token) throws Exception;
}
