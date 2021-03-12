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

    int insertSelective(NoticeInformation record);

    List<NoticeInformation> selectByExampleWithBLOBs(NoticeInformationCriteria example);

    List<NoticeInformation> selectByExample(NoticeInformationCriteria example);

    NoticeInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NoticeInformation record, @Param("example") NoticeInformationCriteria example);

    int updateByExampleWithBLOBs(@Param("record") NoticeInformation record, @Param("example") NoticeInformationCriteria example);

    int updateByExample(@Param("record") NoticeInformation record, @Param("example") NoticeInformationCriteria example);

    int updateByPrimaryKeySelective(NoticeInformation record);

    int updateByPrimaryKeyWithBLOBs(NoticeInformation record);

    int updateByPrimaryKey(NoticeInformation record);

    //自定义查询
    List<NoticeInformation> selectInforationByExample(String id);

    List<NoticeInformation> selectInforationByGrade_id(@Param("grade_id")String grade_id, @Param("curPage")Integer curPage, @Param("pageSize")Integer pageSize);

    //自定义删除
    boolean deleteInforationByExample(@Param("account") String account, @Param("grade_id") String grade_id, @Param("information") String information);
}