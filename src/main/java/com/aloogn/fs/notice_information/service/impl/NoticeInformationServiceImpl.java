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
    public NoticeInformation schoolNoticeInformationRelease(String account, String grade_id, String title, String information, String show_teacher, String show_student, String token) throws Exception {
        //将信息插入数据库表中
        NoticeInformation noticeInformation = new NoticeInformation();
        noticeInformation.setAccount(account);
        noticeInformation.setTitle(title);
        noticeInformation.setInformation(information);
        noticeInformation.setGrade_id(grade_id);
        noticeInformation.setShow_teacher(show_teacher);
        noticeInformation.setShow_student(show_student);

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
    public boolean noticeSchool(int id, String token) throws Exception {
        //根据 id 删除通知记录
        boolean result = noticeInformationMapper.deleteInforationByExample(id);
        return result;
    }

    @Override
    public List<NoticeInformation> noticeFamilyDetails(String garde_id, Integer curPage, Integer pageSize, String token) throws Exception {
        //根据班级 id 查询发布的信息
        List<NoticeInformation> list = noticeInformationMapper.selectInforationByGrade_id(garde_id, curPage, pageSize);
        return list;
    }

    //  修改数据库里的 showBadge 属性
    @Override
    public void updateShowBadge(int id, String show_teacher, String show_student, String token) throws Exception {
        // 检查该通知是否存在
        NoticeInformation noticeInformation = noticeInformationMapper.selectByPrimaryKey(id);
        if(noticeInformation == null){
            new Exception("获取信息错误");
        }

        // 修改 showBadge
        noticeInformation = new NoticeInformation();
        noticeInformation.setId(id);
        noticeInformation.setShow_teacher(show_teacher);
        noticeInformation.setShow_student(show_student);

        noticeInformationMapper.updateByPrimaryKeySelective(noticeInformation);
    }

    // 根据 id 获取通知信息
    @Override
    public NoticeInformation informationById(int id, String token) throws Exception {
        // 检查该通知是否存在
        NoticeInformation noticeInformation = noticeInformationMapper.selectByPrimaryKey(id);
        if(noticeInformation == null){
            new Exception("获取信息错误");
        }

        return noticeInformation;
    }

    // 根据 id 修改通知信息
    @Override
    public void updateInformation(int id, String title, String information, String show_teacher, String token) throws Exception {
        // 检查该通知是否存在
        NoticeInformation noticeInformation = noticeInformationMapper.selectByPrimaryKey(id);
        if(noticeInformation == null){
            new Exception("获取信息错误");
        }

        // 修改 通知信息
        noticeInformation = new NoticeInformation();
        noticeInformation.setId(id);
        noticeInformation.setTitle(title);
        noticeInformation.setInformation(information);
        noticeInformation.setShow_teacher(show_teacher);

        noticeInformationMapper.updateByPrimaryKeySelective(noticeInformation);
    }

}
