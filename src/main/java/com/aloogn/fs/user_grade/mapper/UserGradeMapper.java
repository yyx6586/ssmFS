package com.aloogn.fs.user_grade.mapper;

import com.aloogn.fs.user.bean.User;
import com.aloogn.fs.user_grade.bean.UserGrade;
import com.aloogn.fs.user_grade.bean.UserGradeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGradeMapper {
    long countByExample(UserGradeCriteria example);

    int deleteByExample(UserGradeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserGrade record);

    int insertSelective(UserGrade record);

    List<UserGrade> selectByExample(UserGradeCriteria example);

    UserGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserGrade record, @Param("example") UserGradeCriteria example);

    int updateByExample(@Param("record") UserGrade record, @Param("example") UserGradeCriteria example);

    int updateByPrimaryKeySelective(UserGrade record);

    int updateByPrimaryKey(UserGrade record);

    //自定义查询
    //连表查询
    List<User> selectUserByExample(String grade_id);
}