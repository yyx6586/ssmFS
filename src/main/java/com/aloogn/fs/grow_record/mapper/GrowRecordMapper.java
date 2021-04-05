package com.aloogn.fs.grow_record.mapper;

import com.aloogn.fs.grow_record.bean.GrowRecord;
import com.aloogn.fs.grow_record.bean.GrowRecordCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrowRecordMapper {
    long countByExample(GrowRecordCriteria example);

    int deleteByExample(GrowRecordCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(GrowRecord record);

    int insertSelective(GrowRecord record);

    List<GrowRecord> selectByExample(GrowRecordCriteria example);

    GrowRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GrowRecord record, @Param("example") GrowRecordCriteria example);

    int updateByExample(@Param("record") GrowRecord record, @Param("example") GrowRecordCriteria example);

    int updateByPrimaryKeySelective(GrowRecord record);

    int updateByPrimaryKey(GrowRecord record);

    // 自定义查询成长记录信息列表
    List<GrowRecord> selectRecordInforation(@Param("gradeclass_id")String gradeclass_id, @Param("status")String status);

    // 自定义查询成长记录信息详情
    List<GrowRecord> selectRecordInforationDetails(@Param("gradeclass_id")String gradeclass_id, @Param("status")String status, @Param("release_time")String release_time);

    // 自定义查询
    List<GrowRecord> selectRecordByGradeClass_id(@Param("gradeclass_id")String gradeclass_id, @Param("description")String description);

    //自定义删除
    boolean deleteRecordByExample(int id);
}