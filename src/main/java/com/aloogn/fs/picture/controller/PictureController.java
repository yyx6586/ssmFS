package com.aloogn.fs.picture.controller;

import com.aloogn.common.utils.JSONUtil;
import com.aloogn.fs.picture.bean.Picture;
import com.aloogn.fs.picture.service.PictureService;
import com.aloogn.fs.redis.service.RedisService;
import com.aloogn.fs.user_homework.bean.UserHomework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/picture")
@CrossOrigin("*")      //允许跨域请求
public class PictureController {

    @Autowired
    PictureService pictureService;

    @Autowired
    RedisService redisService;

    JSONUtil jsonUtil = new JSONUtil();

    // 添加头像
    @RequestMapping("/insertUrl")
    @ResponseBody
    public JSONUtil insertUrl(String account, String url, String token) throws Exception{
        jsonUtil.setCode(-1);

        try {
            pictureService.insertUrl(account, url, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("头像上传成功");
        }catch (Exception e){
            jsonUtil.setMsg("头像上传失败");
        }
        return jsonUtil;
    }

    // 修改头像
    @RequestMapping("/updateUrl")
    @ResponseBody
    public JSONUtil updateUrl(String account, String url, String token) throws Exception{
        jsonUtil.setCode(-1);

        try {
            pictureService.updateUrl(account, url, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("头像上传成功");
        }catch (Exception e){
            jsonUtil.setMsg("头像上传失败");
        }
        return jsonUtil;
    }

    // 查询头像
    @RequestMapping("/selectUrl")
    @ResponseBody
    public JSONUtil selectUrl(String account, String token){
        jsonUtil.setCode(-1);

        try {
            Picture picture = pictureService.selectUrl(account, token);
            jsonUtil.setCode(1);
//            jsonUtil.setMsg("获取作业成功");
            jsonUtil.setData(picture);
        } catch (Exception e) {
            jsonUtil.setMsg("头像查询错误，请重新登录");
        }
        return jsonUtil;
    }
}
