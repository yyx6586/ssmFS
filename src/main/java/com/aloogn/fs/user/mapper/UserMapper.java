package com.aloogn.fs.user.mapper;

import com.aloogn.fs.user.bean.User1;
import com.aloogn.fs.user.bean.UserCriteria1;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper1 {
    long countByExample(UserCriteria1 example);//按条件计数

    int deleteByExample(UserCriteria1 example);//按条件删除

    int deleteByPrimaryKey(String id);//按主键删除

    int insert(User1 record);//插入数据（返回值为ID）

    int insertSelective(User1 record);//插入不为null的字段的数据

    List<User1> selectByExample(UserCriteria1 example);//按条件查询

    User1 selectByPrimaryKey(String id);//按主键查询

    int updateByExampleSelective(@Param("record") User1 record, @Param("example") UserCriteria1 example);//按条件更新值不为null的字段

    int updateByExample(@Param("record") User1 record, @Param("example") UserCriteria1 example);//按条件更新

    int updateByPrimaryKeySelective(User1 record);//按主键更新值不为null的字段

    int updateByPrimaryKey(User1 record);//按主键更新

    //自定义mysql语句
    // 模糊查询
    List<User1> findUserById(String id);
}