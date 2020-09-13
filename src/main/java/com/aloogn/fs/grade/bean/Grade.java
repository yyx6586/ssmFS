package com.aloogn.fs.grade.bean;

import java.io.Serializable;
import java.util.Date;

public class Grade implements Serializable {
    private String id;

    private String grade_name;

    private String grade_number;

    private String class_name;

    private String class_number;

    private Date creat_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGrade_name() {
        return grade_name;
    }

    public void setGrade_name(String grade_name) {
        this.grade_name = grade_name == null ? null : grade_name.trim();
    }

    public String getGrade_number() {
        return grade_number;
    }

    public void setGrade_number(String grade_number) {
        this.grade_number = grade_number == null ? null : grade_number.trim();
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name == null ? null : class_name.trim();
    }

    public String getClass_number() {
        return class_number;
    }

    public void setClass_number(String class_number) {
        this.class_number = class_number == null ? null : class_number.trim();
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
        Grade other = (Grade) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGrade_name() == null ? other.getGrade_name() == null : this.getGrade_name().equals(other.getGrade_name()))
            && (this.getGrade_number() == null ? other.getGrade_number() == null : this.getGrade_number().equals(other.getGrade_number()))
            && (this.getClass_name() == null ? other.getClass_name() == null : this.getClass_name().equals(other.getClass_name()))
            && (this.getClass_number() == null ? other.getClass_number() == null : this.getClass_number().equals(other.getClass_number()))
            && (this.getCreat_time() == null ? other.getCreat_time() == null : this.getCreat_time().equals(other.getCreat_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGrade_name() == null) ? 0 : getGrade_name().hashCode());
        result = prime * result + ((getGrade_number() == null) ? 0 : getGrade_number().hashCode());
        result = prime * result + ((getClass_name() == null) ? 0 : getClass_name().hashCode());
        result = prime * result + ((getClass_number() == null) ? 0 : getClass_number().hashCode());
        result = prime * result + ((getCreat_time() == null) ? 0 : getCreat_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }
}