package com.aloogn.fs.score.service;

import com.aloogn.fs.score.bean.Score;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScoreService {

    // 将成绩保存到数据库
    Score insertScore(String teacher_account, String student_account, String gradeclass_id, String score_name, String score_subject, String score_time, String score, String token) throws Exception;

    // 根据班级与年级 gradeclass_id 与科目 查询该班级该科目近五次考试的考试名称
    List<Score> seclectScoreName(String gradeclass_id, String score_subject, String token) throws Exception;

    // 根据班级与年级 gradeclass_id 、科目、考试名称 查询该班级所有学生的考试成绩
    List<Score> selectStudentScore(String gradeclass_id, String score_name, String score_subject, String token) throws Exception;

    // 根据班级与年级 gradeclass_id 、科目、考试名称 删除该班级所有学生的考试成绩
    boolean deleteScore(String gradeclass_id, String score_name, String score_subject, String token) throws Exception;

    // 根据班级与年级 gradeclass_id 、科目、考试名称 修改该班级所有学生的考试信息
    void updateScore(String student_account, String gradeclass_id, String score_name, String score_subject, String score_time, String score, String token) throws Exception;
}
