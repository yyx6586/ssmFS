package com.aloogn.fs.score.bean;

import java.io.Serializable;
import java.util.Date;

public class Score implements Serializable {
    private Integer id;

    private String student_account;

    private String teacher_account;

    private String gradeclass_id;

    private String score_name;

    private String score_subject;

    private String score_time;

    private String score;

    private Date creat_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudent_account() {
        return student_account;
    }

    public void setStudent_account(String student_account) {
        this.student_account = student_account == null ? null : student_account.trim();
    }

    public String getTeacher_account() {
        return teacher_account;
    }

    public void setTeacher_account(String teacher_account) {
        this.teacher_account = teacher_account == null ? null : teacher_account.trim();
    }

    public String getGradeclass_id() {
        return gradeclass_id;
    }

    public void setGradeclass_id(String gradeclass_id) {
        this.gradeclass_id = gradeclass_id == null ? null : gradeclass_id.trim();
    }

    public String getScore_name() {
        return score_name;
    }

    public void setScore_name(String score_name) {
        this.score_name = score_name == null ? null : score_name.trim();
    }

    public String getScore_subject() {
        return score_subject;
    }

    public void setScore_subject(String score_subject) {
        this.score_subject = score_subject == null ? null : score_subject.trim();
    }

    public String getScore_time() {
        return score_time;
    }

    public void setScore_time(String score_time) {
        this.score_time = score_time == null ? null : score_time.trim();
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public Date getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(Date creat_time) {
        this.creat_time = creat_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Score other = (Score) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStudent_account() == null ? other.getStudent_account() == null : this.getStudent_account().equals(other.getStudent_account()))
            && (this.getTeacher_account() == null ? other.getTeacher_account() == null : this.getTeacher_account().equals(other.getTeacher_account()))
            && (this.getGradeclass_id() == null ? other.getGradeclass_id() == null : this.getGradeclass_id().equals(other.getGradeclass_id()))
            && (this.getScore_name() == null ? other.getScore_name() == null : this.getScore_name().equals(other.getScore_name()))
            && (this.getScore_subject() == null ? other.getScore_subject() == null : this.getScore_subject().equals(other.getScore_subject()))
            && (this.getScore_time() == null ? other.getScore_time() == null : this.getScore_time().equals(other.getScore_time()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getCreat_time() == null ? other.getCreat_time() == null : this.getCreat_time().equals(other.getCreat_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStudent_account() == null) ? 0 : getStudent_account().hashCode());
        result = prime * result + ((getTeacher_account() == null) ? 0 : getTeacher_account().hashCode());
        result = prime * result + ((getGradeclass_id() == null) ? 0 : getGradeclass_id().hashCode());
        result = prime * result + ((getScore_name() == null) ? 0 : getScore_name().hashCode());
        result = prime * result + ((getScore_subject() == null) ? 0 : getScore_subject().hashCode());
        result = prime * result + ((getScore_time() == null) ? 0 : getScore_time().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getCreat_time() == null) ? 0 : getCreat_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }
}