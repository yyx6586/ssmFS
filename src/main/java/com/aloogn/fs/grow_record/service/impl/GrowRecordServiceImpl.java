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
    public GrowRecord saveImg(String account, String gradeclass_id, String description, String name, String showBadge, String status, String token) throws Exception {
        // 将图片信息插入数据库
        GrowRecord growRecord = new GrowRecord();

        String[] str = name.split(",");
        for(int i = 0; i < str.length; i ++){
            growRecord.setName(str[i]);
            growRecord.setAccount(account);
            growRecord.setGradeclass_id(gradeclass_id);
            growRecord.setDescription(description);
            growRecord.setShowBadge(showBadge);
            growRecord.setStatus(status);

            //将信息插入表中
            growRecordMapper.insertSelective(growRecord);
        }
        return growRecord;
    }

    // 根据 gradeclass_id 获取成长记录
    @Override
    public List<GrowRecord> recordInformation(String gradeclass_id, String showBadge, String status, Integer curPage, Integer pageSize, String token) throws Exception {
        List<GrowRecord> list = growRecordMapper.selectRecordInforation(gradeclass_id, status, showBadge, curPage, pageSize);
        return list;
    }

    // 根据 gradeclass_id 与 描述 修改成长记录
    @Override
    public void updateRecord(String gradeclass_id, String description, String showBadge, String token) throws Exception {

        // 修改 记录
        GrowRecord growRecord = new GrowRecord();
        growRecord.setDescription(description);
        growRecord.setShowBadge(showBadge);

        growRecordMapper.updateByPrimaryKeySelective(growRecord);
    }

    // 根据 id 删除成长记录
    @Override
    public boolean deleteRecord(int id, String token) throws Exception {
        boolean result = growRecordMapper.deleteRecordByExample(id);
        return result;
    }
}
