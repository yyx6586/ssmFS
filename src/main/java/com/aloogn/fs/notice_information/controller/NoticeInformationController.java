package com.aloogn.fs.notice_information.controller;

import com.aloogn.common.utils.JSONUtil;
import com.aloogn.common.utils.StringUtils;
import com.aloogn.fs.notice_information.bean.NoticeInformation;
import com.aloogn.fs.notice_information.service.NoticeInformationService;
import com.aloogn.fs.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/noticeInformation")
public class NoticeInformationController {
    @Autowired
    NoticeInformationService noticeInformationService;

    @Autowired
    RedisService redisService;

    JSONUtil jsonUtil = new JSONUtil();

    @RequestMapping("/schoolNoticeInformationRelease")
    @ResponseBody
    public JSONUtil schoolNoticeInformationRelease(String account, String grade_id, String title, String information, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号信息错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(grade_id)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(information)){
            jsonUtil.setMsg("发布信息不能为空");
            return jsonUtil;
        }

        try{
            noticeInformationService.schoolNoticeInformationRelease(account, grade_id, title, information, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("信息发布成功");
        } catch (Exception e) {
            jsonUtil.setMsg("信息发布失败" + e.getMessage());
        }
        return jsonUtil;
    }

    @RequestMapping("/schoolNoticeInformationAreledy")
    @ResponseBody
    public JSONUtil schoolNoticeInformationAreledy(String account, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号错误，请联系管理员");
            return jsonUtil;
        }

        try {
            List<NoticeInformation> list = noticeInformationService.schoolNoticeInformationAreledy(account, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("获取发布通知成功");
            jsonUtil.setData(list);
        } catch (Exception e) {
            jsonUtil.setMsg("发布通知查询错误，请重新登录" + e.getMessage());
        }
        return jsonUtil;
    }

    @RequestMapping("/noticeSchool")
    @ResponseBody
    public JSONUtil noticeSchool(String account, String grade_id, String information, String token){
        jsonUtil.setCode(-1);

        try{
            boolean result = noticeInformationService.noticeSchool(account, grade_id, information, token);
            if(result){
                jsonUtil.setCode(1);
                jsonUtil.setMsg("删除成功");
            }else {
                jsonUtil.setMsg("删除失败，请重新删除");
            }
        } catch (Exception e) {
            jsonUtil.setMsg("删除失败，请重新删除" + e.getMessage());
        }
        return jsonUtil;
    }

    @RequestMapping("/noticeFamilyDetails")
    @ResponseBody
    public JSONUtil noticeFamilyDetails(String grade_id, Integer curPage, Integer pageSize, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(grade_id)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        try{
            List<NoticeInformation> list = noticeInformationService.noticeFamilyDetails(grade_id, curPage, pageSize, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("获取通知成功");
            jsonUtil.setData(list);
        } catch (Exception e) {
            jsonUtil.setMsg("获取通知失败" + e.getMessage());
        }

        return jsonUtil;
    }
}
