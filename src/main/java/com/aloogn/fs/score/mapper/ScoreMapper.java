package com.aloogn.fs.score.mapper;

import com.aloogn.fs.score.bean.Score;
import com.aloogn.fs.score.bean.ScoreCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    long countByExample(ScoreCriteria example);

    int deleteByExample(ScoreCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreCriteria example);

    Score selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreCriteria example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreCriteria example);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

    // 根据班级与年级 gradeclass_id 与科目 查询该班级该科目近五次考试的考试名称
    // 自定义查询
    List<Score> seclectScoreName(@Param("gradeclass_id") String gradeclass_id, @Param("score_subject") String score_subject);


    // 根据班级与年级 gradeclass_id 、科目、考试名称 与 教师账号 查询该班级所有学生的考试成绩
    // 自定义查询
    List<Score> selectStudentScore(@Param("gradeclass_id") String gradeclass_id, @Param("score_name") String score_name, @Param("score_subject") String score_subject);

    // 根据班级与年级 gradeclass_id 、科目、考试名称 与 教师账号 删除该班级所有学生的考试成绩
    // 自定义删除
    boolean deleteScore(@Param("gradeclass_id") String gradeclass_id, @Param("score_name") String score_name, @Param("score_subject") String score_subject);
}