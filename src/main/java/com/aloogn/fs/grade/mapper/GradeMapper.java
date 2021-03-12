package com.aloogn.fs.grade.mapper;

import com.aloogn.fs.grade.bean.Grade;
import com.aloogn.fs.grade.bean.GradeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
    long countByExample(GradeCriteria example);

    int deleteByExample(GradeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(GradeCriteria example);

    Grade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeCriteria example);

    int updateByExample(@Param("record") Grade record, @Param("example") GradeCriteria example);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);

    // 根据班级与年级名称查询班级与年级id
    Grade selectGradeClassByAccount(@Param("grade_name") String grade_name, @Param("class_name") String class_name);

    // 根据班级与年级id查询班级与年级名称
    Grade selectIdByGradeClassName(String gradeclass_id);
}