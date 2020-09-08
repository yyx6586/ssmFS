package com.aloogn.fs.user.mapper;

import com.aloogn.fs.user.bean.User;
import com.aloogn.fs.user.bean.UserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserCriteria example);//按条件计数

    int deleteByExample(UserCriteria example);//按条件删除

    int deleteByPrimaryKey(String id);//按主键删除

    int insert(User record);//插入数据（返回值为ID）

    int insertSelective(User record);//插入不为null的字段的数据

    List<User> selectByExample(UserCriteria example);//按条件查询

    User selectByPrimaryKey(String id);//按主键查询

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserCriteria example);//按条件更新值不为null的字段

    int updateByExample(@Param("record") User record, @Param("example") UserCriteria example);//按条件更新

    int updateByPrimaryKeySelective(User record);//按主键更新值不为null的字段

    int updateByPrimaryKey(User record);//按主键更新
}