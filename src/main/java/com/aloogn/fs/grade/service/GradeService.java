package com.aloogn.fs.grade.service;

import com.aloogn.fs.grade.bean.Grade;
import org.springframework.stereotype.Service;

@Service
public interface GradeService {
    Grade gradeClassId(String grade_name, String class_name,  String token) throws Exception;

    Grade gradeClassName(String gradeclass_id,  String token) throws Exception;
}
