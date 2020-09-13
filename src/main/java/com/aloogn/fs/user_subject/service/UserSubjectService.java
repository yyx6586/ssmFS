package com.aloogn.fs.user_subject.service;

import com.aloogn.fs.user_subject.bean.SchoolUserSubject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserSubjectService {

    List<SchoolUserSubject> SchoolPersonalDetails(String account, String token) throws Exception;
}
