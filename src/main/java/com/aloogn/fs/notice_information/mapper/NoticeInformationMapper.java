package com.aloogn.fs.notice_information.mapper;

import com.aloogn.fs.notice_information.bean.NoticeInformation;
import com.aloogn.fs.notice_information.bean.NoticeInformationCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeInformationMapper {
    long countByExample(NoticeInformationCriteria example);

    int deleteByExample(NoticeInformationCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(NoticeInformation record);

    int insertSelective(String record);

    List<NoticeInformation> selectByExample(NoticeInformationCriteria example);

    NoticeInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NoticeInformation record, @Param("example") NoticeInformationCriteria example);

    int updateByExample(@Param("record") NoticeInformation record, @Param("example") NoticeInformationCriteria example);

    int updateByPrimaryKeySelective(NoticeInformation record);

    int updateByPrimaryKey(NoticeInformation record);

//    //自定义
//    //插入语句
//    NoticeInformation insertInformationByExample(String id);
}