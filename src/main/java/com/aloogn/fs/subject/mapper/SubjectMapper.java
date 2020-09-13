package com.aloogn.fs.subject.mapper;

import com.aloogn.fs.subject.bean.Subject;
import com.aloogn.fs.subject.bean.SubjectCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectMapper {
    long countByExample(SubjectCriteria example);

    int deleteByExample(SubjectCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(Subject record);

    int insertSelective(Subject record);

    List<Subject> selectByExample(SubjectCriteria example);

    Subject selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Subject record, @Param("example") SubjectCriteria example);

    int updateByExample(@Param("record") Subject record, @Param("example") SubjectCriteria example);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}