package com.aloogn.fs.user_homework.mapper;

import com.aloogn.fs.user_homework.bean.UserHomework;
import com.aloogn.fs.user_homework.bean.UserHomeworkCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserHomeworkMapper {
    long countByExample(UserHomeworkCriteria example);

    int deleteByExample(UserHomeworkCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserHomework record);

    int insertSelective(UserHomework record);

    List<UserHomework> selectByExampleWithBLOBs(UserHomeworkCriteria example);

    List<UserHomework> selectByExample(UserHomeworkCriteria example);

    UserHomework selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserHomework record, @Param("example") UserHomeworkCriteria example);

    int updateByExampleWithBLOBs(@Param("record") UserHomework record, @Param("example") UserHomeworkCriteria example);

    int updateByExample(@Param("record") UserHomework record, @Param("example") UserHomeworkCriteria example);

    int updateByPrimaryKeySelective(UserHomework record);

    int updateByPrimaryKeyWithBLOBs(UserHomework record);

    int updateByPrimaryKey(UserHomework record);

    //自定义查询
    List<UserHomework> selectHomeworkByExample(String id);

    List<UserHomework> selectHomeworkByGrade_id(@Param("gradeclass_id")String gradeclass_id, @Param("curPage")Integer curPage, @Param("pageSize")Integer pageSize);

    List<UserHomework> selectHomework(@Param("grade_id") String grade_id, @Param("subject_name") String subject_name);

    //自定义删除
    boolean deleteHomeworkByExample(int id);
}