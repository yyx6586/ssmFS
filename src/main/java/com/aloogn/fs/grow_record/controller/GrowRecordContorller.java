package com.aloogn.fs.grow_record.controller;

import com.aloogn.common.utils.JSONUtil;
import com.aloogn.common.utils.StringUtils;
import com.aloogn.fs.grow_record.bean.GrowRecord;
import com.aloogn.fs.grow_record.service.GrowRecordService;
import com.aloogn.fs.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/growRecord")
@CrossOrigin("*")      //允许跨域请求
public class GrowRecordContorller {

    @Autowired
    GrowRecordService growRecordService;

    @Autowired
    RedisService redisService;

    JSONUtil jsonUtil = new JSONUtil();

    //接收图片
    @RequestMapping("/imgUpload")
    @ResponseBody
    public String imgUpload(HttpServletRequest request, @RequestParam("file") MultipartFile uploadFile){
//        jsonUtil.setCode(-1);

        String str = null;


        // 使用fileupload组件完成文件上传
        // 1. 指定文件上传保存的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/img");

        // 判断该路径是否存在
        File file = new File(path);
        if (!file.exists() || !file.isDirectory()){
            file.mkdirs();
        }

        // 打印一下文件保存的路径
        System.out.println("path:"+path);

        // 说明上传文件项
        // 获取上传文件的名称
        if(uploadFile == null){
            str = "图片上传为空";
//            jsonUtil.setMsg("图片上传为空");
            return str;
        }

        String filename = uploadFile.getOriginalFilename();
//        String filename = "1.jpg";

        if(StringUtils.isNullOrEmpty(filename)){
            str = "图片上传失败";
//            jsonUtil.setMsg("图片上传失败");
            return str;
        }

        // 把文件的名称设置唯一值，uuid
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid+"_"+filename;

        // 3.上传文件
        try {
            uploadFile.transferTo(new File(path,filename));
//            jsonUtil.setCode(1);
//            jsonUtil.setMsg("图片上传成功");
            str =  "uploads/img/" + filename;
//            jsonUtil.setData(str);
        } catch (IOException e) {
            str = "图片上传失败";
//            jsonUtil.setMsg("图片上传失败");
        }
        return str;
    }


    // 将图片保存到数据库
    @RequestMapping("/saveImg")
    @ResponseBody
    public JSONUtil saveImg(String account, String gradeclass_id, String description, String name, String show_teacher, String show_student, String release_time, String status, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(account)){
            jsonUtil.setMsg("账号信息错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(gradeclass_id)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(name)){
            jsonUtil.setMsg("图片不能为空");
            return jsonUtil;
        }

//        String[] str = name.split(",");
        try{
//            for(int i = 0; i < str.length; i ++){
//                growRecordService.saveImg(account, gradeclass_id, description, name, token);
//            }
            growRecordService.saveImg(account, gradeclass_id, description, name, show_teacher, show_student, release_time, status, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("上传成功");
        } catch (Exception e) {
            jsonUtil.setMsg("上传失败" + e.getMessage());
        }
        return jsonUtil;
    }

    // 根据 gradeclass_id 获取成长记录列表
    @RequestMapping("/recordInformation")
    @ResponseBody
    public JSONUtil recordInformation(String gradeclass_id, String status, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(gradeclass_id)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        try{
            List<GrowRecord> list = growRecordService.recordInformation(gradeclass_id, status, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("获取数据成功");
            jsonUtil.setData(list);
        } catch (Exception e) {
            jsonUtil.setMsg("获取数据失败");
        }

        return jsonUtil;
    }

    // 根据 gradeclass_id 获取成长记录详情
    @RequestMapping("/recordInformationDetails")
    @ResponseBody
    public JSONUtil recordInformationDetails(String gradeclass_id, String status,String release_time, String token){
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(gradeclass_id)){
            jsonUtil.setMsg("班级错误，请联系管理员");
            return jsonUtil;
        }

        try{
            List<GrowRecord> list = growRecordService.recordInformationDetails(gradeclass_id, status, release_time, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("获取数据成功");
            jsonUtil.setData(list);
        } catch (Exception e) {
            jsonUtil.setMsg("获取数据失败");
        }

        return jsonUtil;
    }

    // 根据 gradeclass_id 与 描述 修改成长记录
    @RequestMapping("/updateRecord")
    @ResponseBody
    public JSONUtil updateRecord(String gradeclass_id, String description, String release_time, String show_teacher, String token) throws Exception{
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(release_time)){
            jsonUtil.setMsg("获取数据错误，请重新点击");
            return jsonUtil;
        }

        try {
            growRecordService.updateRecord(gradeclass_id, description, show_teacher, release_time, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("修改成功");
        }catch (Exception e){
            jsonUtil.setMsg("修改错误" + e.getMessage());
        }
        return jsonUtil;
    }

    // 根据 id 删除成长记录
    @RequestMapping("/deleteRecord")
    @ResponseBody
    public JSONUtil deleteRecord(int id, String token){
        jsonUtil.setCode(-1);

        try{
            boolean result = growRecordService.deleteRecord(id, token);
            if(result){
                jsonUtil.setCode(1);
                jsonUtil.setMsg("删除成功");
            }else {
                jsonUtil.setMsg("删除失败，请重新删除");
            }
        } catch (Exception e) {
            jsonUtil.setMsg("删除失败，请重新删除");
        }
        return jsonUtil;
    }

    // 修改数据库里的 showBadge 属性
    @RequestMapping("/updateRecordShowBadge")
    @ResponseBody
    public JSONUtil updateShowBadge(String id, String gradeclass_id, String release_time, String show_teacher, String show_student, String token) throws Exception{
        jsonUtil.setCode(-1);

        if(StringUtils.isNullOrEmpty(gradeclass_id)){
            jsonUtil.setMsg("获取数据错误，请重新点击");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(release_time)){
            jsonUtil.setMsg("获取数据错误，请重新点击");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(show_teacher)){
            jsonUtil.setMsg("获取数据错误，请重新点击");
            return jsonUtil;
        }

        if(StringUtils.isNullOrEmpty(show_student)){
            jsonUtil.setMsg("获取数据错误，请重新点击");
            return jsonUtil;
        }

        try {
            growRecordService.updateShowBadge(id, gradeclass_id, release_time, show_teacher, show_student, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("修改成功");
        }catch (Exception e){
            jsonUtil.setMsg("修改错误" + e.getMessage());
        }
        return jsonUtil;
    }
}
