package com.aloogn.fs.notice_information.service;

import com.aloogn.fs.notice_information.bean.NoticeInformation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoticeInformationService {
    NoticeInformation schoolNoticeInformationRelease(String account, String grade_id, String title, String information, String show_teacher, String show_student, String token) throws Exception;

    List<NoticeInformation> schoolNoticeInformationAreledy(String account, String token) throws Exception;

    boolean noticeSchool(int id, String token) throws Exception;

    List<NoticeInformation> noticeFamilyDetails(String garde_id, Integer curPage, Integer pageSize, String token) throws Exception;


    //  修改数据库里的 showBadge 属性
    void updateShowBadge(int id, String show_teacher, String show_student, String token) throws Exception;

    // 根据 id 获取通知信息
    NoticeInformation informationById(int id, String token) throws Exception;

    // 根据 id 修改通知信息
    void updateInformation(int id, String title, String information, String show_teacher, String token) throws Exception;

}
