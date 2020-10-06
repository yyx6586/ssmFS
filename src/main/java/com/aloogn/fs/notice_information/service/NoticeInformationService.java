package com.aloogn.fs.notice_information.service;

import com.aloogn.fs.notice_information.bean.NoticeInformation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NoticeInformationService {
    NoticeInformation schoolNoticeInformationRelease(String account, String grade_id, String information, String token) throws Exception;

    List<NoticeInformation> schoolNoticeInformationAreledy(String account, String token) throws Exception;

    boolean noticeSchool(String account, String grade_id, String information, String token) throws Exception;

    List<NoticeInformation> noticeFamilyDetails(String garde_id, String token) throws Exception;

}
