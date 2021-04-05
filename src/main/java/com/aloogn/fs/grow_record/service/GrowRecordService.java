package com.aloogn.fs.grow_record.service;

import com.aloogn.fs.grow_record.bean.GrowRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GrowRecordService {

    // 将图片地址保存到数据库
    GrowRecord saveImg(String account, String gradeclass_id, String description, String name, String show_teacher, String show_student, String release_time, String status, String token) throws Exception;

    // 根据 gradeclass_id 获取成长记录列表
    List<GrowRecord> recordInformation(String gradeclass_id, String status, String token) throws Exception;

    // 根据 gradeclass_id 获取成长记录详情
    List<GrowRecord> recordInformationDetails(String gradeclass_id, String status, String release_time, String token) throws Exception;

    // 根据 gradeclass_id 与 描述 修改成长记录
    void updateRecord(String gradeclass_id, String description, String release_time, String show_teacher, String token) throws Exception;

    // 根据 id 删除成长记录
    boolean deleteRecord(int id, String token) throws Exception;

    //  修改数据库里的 showBadge 属性
    void updateShowBadge(String id, String gradeclass_id, String release_time, String show_teacher, String show_student, String token) throws Exception;
}
