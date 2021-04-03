package com.aloogn.fs.score.controller;

import com.aloogn.common.utils.JSONUtil;
import com.aloogn.fs.redis.service.RedisService;
import com.aloogn.fs.score.bean.Score;
import com.aloogn.fs.score.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/score")
@CrossOrigin("*")      //允许跨域请求
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @Autowired
    RedisService redisService;

    JSONUtil jsonUtil = new JSONUtil();

    // 添加成绩
    @RequestMapping("/insertScore")
    @ResponseBody
    public JSONUtil insertScore(String teacher_account, String student_account, String gradeclass_id, String score_name, String score_subject, String score_time, String score, String token) throws Exception{
        jsonUtil.setCode(-1);

        try {
            scoreService.insertScore(teacher_account, student_account,gradeclass_id, score_name, score_subject, score_time, score, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("成绩保存成功");
        }catch (Exception e){
            jsonUtil.setMsg("成绩保存失败,请重新保存");
        }
        return jsonUtil;
    }

    // 根据班级与年级 gradeclass_id 与科目 查询该班级该科目近五次考试的考试名称
    @RequestMapping("/seclectScoreName")
    @ResponseBody
    public JSONUtil seclectScoreName(String gradeclass_id, String score_subject, String token) throws Exception{
        jsonUtil.setCode(-1);

        try {
            List<Score> list = scoreService.seclectScoreName(gradeclass_id, score_subject, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("考试名称获取成功");
            jsonUtil.setData(list);
        }catch (Exception e){
            jsonUtil.setMsg("考试名称失败,请重新获取");
        }
        return jsonUtil;
    }

    // 根据班级与年级 gradeclass_id 、科目、考试名称 与 教师账号 查询该班级所有学生的考试成绩
    @RequestMapping("/selectStudentScore")
    @ResponseBody
    public JSONUtil selectStudentScore(String gradeclass_id, String score_name, String score_subject, String token) throws Exception{
        jsonUtil.setCode(-1);

        try {
            List<Score> list = scoreService.selectStudentScore(gradeclass_id, score_name, score_subject, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("学生成绩获取成功");
            jsonUtil.setData(list);
        }catch (Exception e){
            jsonUtil.setMsg("学生成绩获取失败,请重新获取");
        }
        return jsonUtil;
    }

    // 根据班级与年级 gradeclass_id 、科目、考试名称 与 教师账号 删除该班级所有学生的考试成绩
    @RequestMapping("/deleteScore")
    @ResponseBody
    public JSONUtil deleteScore(String gradeclass_id, String score_name, String score_subject, String token) throws Exception{
        jsonUtil.setCode(-1);

        try {
            scoreService.deleteScore(gradeclass_id, score_name, score_subject, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("删除成功");
        }catch (Exception e){
            jsonUtil.setMsg("删除失败,请重新删除");
        }
        return jsonUtil;
    }

    // 根据班级与年级 gradeclass_id 、科目、考试名称 与 教师账号 修改该班级所有学生的考试信息
    @RequestMapping("/updateScore")
    @ResponseBody
    public JSONUtil updateScore(String student_account, String gradeclass_id, String score_name, String score_subject, String score_time, String score, String token) throws Exception{
        jsonUtil.setCode(-1);

        try {
            scoreService.updateScore(student_account,gradeclass_id, score_name, score_subject, score_time, score, token);
            jsonUtil.setCode(1);
            jsonUtil.setMsg("修改成功");
        }catch (Exception e){
            jsonUtil.setMsg("修改失败,请重新修改");
        }
        return jsonUtil;
    }
}
