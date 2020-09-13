package com.aloogn.fs.grade.service.impl;

import com.aloogn.fs.grade.mapper.GradeMapper;
import com.aloogn.fs.grade.service.GradeService;
import com.aloogn.fs.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

public class GradeServiceImpl implements GradeService {

    @Autowired
    GradeMapper gradeMapper;

    @Autowired
    RedisService redisService;
}
