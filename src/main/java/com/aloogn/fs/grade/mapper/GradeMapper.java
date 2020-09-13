package com.aloogn.fs.grade.mapper;

import com.aloogn.fs.grade.bean.Grade;
import com.aloogn.fs.grade.bean.GradeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GradeMapper {
    long countByExample(GradeCriteria example);

    int deleteByExample(GradeCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(Grade record);

    int insertSelective(Grade record);

    List<Grade> selectByExample(GradeCriteria example);

    Grade selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Grade record, @Param("example") GradeCriteria example);

    int updateByExample(@Param("record") Grade record, @Param("example") GradeCriteria example);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}