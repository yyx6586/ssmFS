package com.aloogn.fs.picture.service.impl;

import com.aloogn.fs.picture.bean.Picture;
import com.aloogn.fs.picture.mapper.PictureMapper;
import com.aloogn.fs.picture.service.PictureService;
import com.aloogn.fs.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

public class PictureServiceImpl implements PictureService {
    @Autowired
    PictureMapper pictureMapper;

    @Autowired
    RedisService redisService;

    // 添加头像
    @Override
    public Picture insertUrl(String account, String url, String token) throws Exception {

        Picture picture = new Picture();
        picture.setAccount(account);
        picture.setUrl(url);
        pictureMapper.insertSelective(picture);

        return picture;
    }

    // 修改头像
    @Override
    public void updateUrl(String account, String url, String token) throws Exception {
        // 根据账号查询该用户是否存在
        Picture picture = pictureMapper.selectByPrimaryKey(account);
        if(picture == null){
            new Exception("获取信息错误");
        }

        picture.setAccount(account);
        picture.setUrl(url);
        pictureMapper.updateByPrimaryKeySelective(picture);
    }

    // 查询头像
    @Override
    public Picture selectUrl(String account, String token) throws Exception {

        // 根据账号查询该用户是否存在
        Picture picture = pictureMapper.selectByPrimaryKey(account);
        if(picture == null){
            new Exception("获取信息错误");
        }

        return picture;
    }
}
