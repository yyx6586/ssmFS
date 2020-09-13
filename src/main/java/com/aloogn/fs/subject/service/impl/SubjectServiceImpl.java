package com.aloogn.fs.subject.service.impl;

import com.aloogn.fs.redis.service.RedisService;
import com.aloogn.fs.subject.mapper.SubjectMapper;
import com.aloogn.fs.subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;

public class SubjectServiceImpl implements SubjectService {
    @Autowired
    SubjectMapper subjectMapper;

    @Autowired
    RedisService redisService;
}
