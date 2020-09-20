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
    public NoticeInformation schoolNoticeInformationRelease(String account, String information, String token) throws Exception {
        //将信息插入数据库表中
        NoticeInformation noticeInformation = new NoticeInformation();
        noticeInformation.setAccount(account);
        noticeInformation.setInformation(information);

        //将信息插入表中
        noticeInformationMapper.insert(noticeInformation);
        return noticeInformation;
    }

    @Override
    public List<NoticeInformation> schoolNoticeInformationAreledy(String account, String token) throws Exception{
        //根据账号查询发布的信息
        List<NoticeInformation> list = noticeInformationMapper.selectInforationByExample(account);
        return list;
    }
}
