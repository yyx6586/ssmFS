package com.aloogn.fs.notice_information.service.impl;

import com.aloogn.fs.notice_information.bean.NoticeInformation;
import com.aloogn.fs.notice_information.mapper.NoticeInformationMapper;
import com.aloogn.fs.notice_information.service.NoticeInformationService;
import com.aloogn.fs.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NoticeInformationServiceImpl implements NoticeInformationService {

    @Autowired
    NoticeInformationMapper noticeInformationMapper;

    @Autowired
    RedisService redisService;

    @Override
    public NoticeInformation schoolNoticeInformationRelease(String account, String grade_id, String information, String token) throws Exception {
        //将信息插入数据库表中
        NoticeInformation noticeInformation = new NoticeInformation();
        noticeInformation.setAccount(account);
        noticeInformation.setInformation(information);
        noticeInformation.setGrade_id(grade_id);

        //将信息插入表中
        noticeInformationMapper.insertSelective(noticeInformation);
        return noticeInformation;
    }

    @Override
    public List<NoticeInformation> schoolNoticeInformationAreledy(String account, String token) throws Exception{
        //根据账号查询发布的信息
        List<NoticeInformation> list = noticeInformationMapper.selectInforationByExample(account);
        return list;
    }

    @Override
    public boolean noticeSchool(String account, String grade_id, String information, String token) throws Exception {
        //根据账号、班级、信息，删除通知记录
        boolean result = noticeInformationMapper.deleteInforationByExample(account, grade_id, information);
        return result;
    }

    @Override
    public List<NoticeInformation> noticeFamilyDetails(String garde_id, String token) throws Exception {
        //根据班级 id 查询发布的信息
        List<NoticeInformation> list = noticeInformationMapper.selectInforationByExample(garde_id);
        return list;
    }

}
