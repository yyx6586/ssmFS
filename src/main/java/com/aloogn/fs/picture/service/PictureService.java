package com.aloogn.fs.picture.service;

import com.aloogn.fs.picture.bean.Picture;
import org.springframework.stereotype.Service;

@Service
public interface PictureService {

    // 添加头像
    Picture insertUrl(String account, String url, String token) throws Exception;

    // 修改头像
    void updateUrl(String account, String url, String token) throws Exception;

    // 查询头像
    Picture selectUrl(String account, String token) throws Exception;
}
