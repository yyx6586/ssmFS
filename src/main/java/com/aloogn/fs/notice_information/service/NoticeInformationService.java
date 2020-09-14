package com.aloogn.fs.notice_information.service;

import com.aloogn.fs.notice_information.bean.NoticeInformation;
import org.springframework.stereotype.Service;

@Service
public interface NoticeInformationService {
    NoticeInformation schoolNoticeInformationRelease(String information, String token) throws Exception;
}
