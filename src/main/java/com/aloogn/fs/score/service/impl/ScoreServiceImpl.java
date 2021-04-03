package com.aloogn.fs.score.service.impl;

import com.aloogn.fs.redis.service.RedisService;
import com.aloogn.fs.score.bean.Score;
import com.aloogn.fs.score.mapper.ScoreMapper;
import com.aloogn.fs.score.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ScoreServiceImpl implements ScoreService {

    @Autowired
    ScoreMapper scoreMapper;

    @Autowired
    RedisService redisService;

    // 添加成绩
    @Override
    public Score insertScore(String teacher_account, String student_account, String gradeclass_id, String score_name, String score_subject, String score_time, String score, String token) throws Exception {
        Score score1 = new Score();

        String[] str1 = student_account.split(",");
        String[] str2 = score.split(",");
        for(int i = 0; i < str1.length; i ++){
            score1.setTeacher_account(teacher_account);
            score1.setStudent_account(str1[i]);
            score1.setGradeclass_id(gradeclass_id);
            score1.setScore_name(score_name);
            score1.setScore_subject(score_subject);
            score1.setScore_time(score_time);
            score1.setScore(str2[i]);

            //将成绩插入表中
            scoreMapper.insertSelective(score1);
        }
        return score1;
    }

    // 根据班级与年级 gradeclass_id 与科目 查询该班级该科目近五次考试的考试名称
    @Override
    public List<Score> seclectScoreName(String gradeclass_id, String score_subject, String token) throws Exception {
        List<Score> list = scoreMapper.seclectScoreName(gradeclass_id,score_subject);

        return list;
    }

    // 根据班级与年级 gradeclass_id 、科目、考试名称 查询该班级所有学生的考试成绩
    @Override
    public List<Score> selectStudentScore(String gradeclass_id, String score_name, String score_subject, String token) throws Exception {
        List<Score> list = scoreMapper.selectStudentScore(gradeclass_id, score_name, score_subject);
        return list;
    }

    // 根据班级与年级 gradeclass_id 、科目、考试名称 与 教师账号 删除该班级所有学生的考试成绩
    @Override
    public boolean deleteScore(String gradeclass_id, String score_name, String score_subject, String token) throws Exception {
        // 根据班级与年级 gradeclass_id 、科目、考试名称 与 教师账号 查询该班级所有学生的考试成绩 是否存在
        List<Score> list = scoreMapper.selectStudentScore(gradeclass_id, score_name, score_subject);

        if(list.size() == 0){
            new Exception("该班级没有这场考试，请联系管理员");
        }

        boolean result = scoreMapper.deleteScore(gradeclass_id, score_name, score_subject);
        return result;
    }

    // 根据班级与年级 gradeclass_id 、科目、考试名称 与 教师账号 修改该班级所有学生的考试信息
    @Override
    public void updateScore(String student_account, String gradeclass_id, String score_name, String score_subject, String score_time, String score, String token) throws Exception {
        // 根据班级与年级 gradeclass_id 、科目、考试名称 查询该班级所有学生的考试成绩 是否存在
        List<Score> list = scoreMapper.selectStudentScore(gradeclass_id, score_name, score_subject);

        if(list.size() == 0){
            new Exception("该班级没有这场考试，请联系管理员");
        }

        Score score1 = new Score();
        String[] str1 = student_account.split(",");
        String[] str2 = score.split(",");
        for(int i = 0; i < str1.length; i ++){
            score1.setStudent_account(str1[i]);
            score1.setGradeclass_id(gradeclass_id);
            score1.setScore_name(score_name);
            score1.setScore_subject(score_subject);
            score1.setScore_time(score_time);
            score1.setScore(str2[i]);

            //修改成绩信息
            scoreMapper.updateByPrimaryKeySelective(score1);
        }

    }
}
