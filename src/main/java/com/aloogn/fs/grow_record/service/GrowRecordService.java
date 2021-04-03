package com.aloogn.fs.grow_record.service;

import com.aloogn.fs.grow_record.bean.GrowRecord;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GrowRecordService {

    // 将图片地址保存到数据库
    GrowRecord saveImg(String account, String gradeclass_id, String description, String name, String showBadge, String status, String token) throws Exception;

    // 根据 gradeclass_id 获取成长记录
    List<GrowRecord> recordInformation(String gradeclass_id, String showBadge, String status, Integer curPage, Integer pageSize, String token) throws Exception;

    // 根据 gradeclass_id 与 描述 修改成长记录
    void updateRecord(String gradeclass_id, String description, String showBadge, String token) throws Exception;

    // 根据 id 删除成长记录
    boolean deleteRecord(int id, String token) throws Exception;
}
