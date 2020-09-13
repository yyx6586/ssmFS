package com.aloogn.fs.user_subject.service.impl;

import com.aloogn.fs.redis.service.RedisService;
import com.aloogn.fs.user.bean.User;
import com.aloogn.fs.user_subject.bean.SchoolUserSubject;
import com.aloogn.fs.user_subject.mapper.UserSubjectMapper;
import com.aloogn.fs.user_subject.service.UserSubjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserSubjectServiceImpl implements UserSubjectService {

    @Autowired
    UserSubjectMapper userSubjectMapper;

    @Autowired
    RedisService redisService;

    @Override
    public List<SchoolUserSubject> SchoolPersonalDetails(String account, String token) throws Exception {
        //根据账号进行连接查询
        List<SchoolUserSubject> schoolUserSubject = userSubjectMapper.selectUserByExample(account);
        return schoolUserSubject;
    }
}
