package com.aloogn.fs.user_subject.mapper;

import com.aloogn.fs.user.bean.User;
import com.aloogn.fs.user_subject.bean.SchoolUserSubject;
import com.aloogn.fs.user_subject.bean.UserSubject;
import com.aloogn.fs.user_subject.bean.UserSubjectCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSubjectMapper {
    long countByExample(UserSubjectCriteria example);

    int deleteByExample(UserSubjectCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserSubject record);

    int insertSelective(UserSubject record);

    List<UserSubject> selectByExample(UserSubjectCriteria example);

    UserSubject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserSubject record, @Param("example") UserSubjectCriteria example);

    int updateByExample(@Param("record") UserSubject record, @Param("example") UserSubjectCriteria example);

    int updateByPrimaryKeySelective(UserSubject record);

    int updateByPrimaryKey(UserSubject record);

    //自定义
    //连接查询
    List<SchoolUserSubject> selectUserByExample(String id);
}