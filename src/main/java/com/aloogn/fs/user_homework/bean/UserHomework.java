package com.aloogn.fs.user_homework.bean;

import java.io.Serializable;
import java.util.Date;

public class UserHomework implements Serializable {
    private Integer id;

    private String account;

    private String subject_name;

    private String grade_id;

    private String homework;

    private Date creat_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name == null ? null : subject_name.trim();
    }

    public String getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(String grade_id) {
        this.grade_id = grade_id == null ? null : grade_id.trim();
    }

    public String getHomework() {
        return homework;
    }

    public void setHomework(String homework) {
        this.homework = homework == null ? null : homework.trim();
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
        UserHomework other = (UserHomework) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getSubject_name() == null ? other.getSubject_name() == null : this.getSubject_name().equals(other.getSubject_name()))
            && (this.getGrade_id() == null ? other.getGrade_id() == null : this.getGrade_id().equals(other.getGrade_id()))
            && (this.getHomework() == null ? other.getHomework() == null : this.getHomework().equals(other.getHomework()))
            && (this.getCreat_time() == null ? other.getCreat_time() == null : this.getCreat_time().equals(other.getCreat_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getSubject_name() == null) ? 0 : getSubject_name().hashCode());
        result = prime * result + ((getGrade_id() == null) ? 0 : getGrade_id().hashCode());
        result = prime * result + ((getHomework() == null) ? 0 : getHomework().hashCode());
        result = prime * result + ((getCreat_time() == null) ? 0 : getCreat_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }
}