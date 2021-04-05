package com.aloogn.fs.grow_record.service.impl;

import com.aloogn.fs.grow_record.bean.GrowRecord;
import com.aloogn.fs.grow_record.mapper.GrowRecordMapper;
import com.aloogn.fs.grow_record.service.GrowRecordService;
import com.aloogn.fs.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GrowRecordServiceImpl implements GrowRecordService {

    @Autowired
    GrowRecordMapper growRecordMapper;

    @Autowired
    RedisService redisService;

    //将图片或者视频保存到数据库里
    @Override
    public GrowRecord saveImg(String account, String gradeclass_id, String description, String name, String show_teacher, String show_student, String release_time, String status, String token) throws Exception {
        // 将图片信息插入数据库
        GrowRecord growRecord = new GrowRecord();

        String[] str = name.split(",");
        for(int i = 0; i < str.length; i ++){
            growRecord.setName(str[i]);
            growRecord.setAccount(account);
            growRecord.setGradeclass_id(gradeclass_id);
            growRecord.setDescription(description);
            growRecord.setShow_teacher(show_teacher);
            growRecord.setShow_student(show_student);
            growRecord.setRelease_time(release_time);
            growRecord.setStatus(status);

            //将信息插入表中
            growRecordMapper.insertSelective(growRecord);
        }
        return growRecord;
    }

    // 获取成长记录详情
    @Override
    public List<GrowRecord> recordInformationDetails(String gradeclass_id, String status, String release_time, String token) throws Exception {
        List<GrowRecord> list = growRecordMapper.selectRecordInforationDetails(gradeclass_id, status, release_time);
        return list;
    }

    // 根据 gradeclass_id 获取成长记录列表
    @Override
    public List<GrowRecord> recordInformation(String gradeclass_id, String status, String token) throws Exception {
        List<GrowRecord> list = growRecordMapper.selectRecordInforation(gradeclass_id, status);
        return list;
    }

    // 根据 gradeclass_id 与 描述 修改成长记录
    @Override
    public void updateRecord(String gradeclass_id, String description, String release_time, String show_teacher, String token) throws Exception {

        // 修改 记录
        GrowRecord growRecord = new GrowRecord();
        growRecord.setDescription(description);
        growRecord.setRelease_time(release_time);
        growRecord.setShow_teacher(show_teacher);

        growRecordMapper.updateByPrimaryKeySelective(growRecord);
    }

    // 根据 id 删除成长记录
    @Override
    public boolean deleteRecord(int id, String token) throws Exception {
        boolean result = growRecordMapper.deleteRecordByExample(id);
        return result;
    }

    //  修改数据库里的 showBadge 属性
    @Override
    public void updateShowBadge(String id, String gradeclass_id, String release_time, String show_teacher, String show_student, String token) throws Exception {
        GrowRecord growRecord = new GrowRecord();

        String[] str = id.split(",");

        for(int i = 0; i < str.length; i ++){
            growRecord.setId(Integer.parseInt(str[i]));
            growRecord.setGradeclass_id(gradeclass_id);
            growRecord.setRelease_time(release_time);
            growRecord.setShow_teacher(show_teacher);
            growRecord.setShow_student(show_student);
            growRecordMapper.updateByPrimaryKeySelective(growRecord);
        }
    }


}
