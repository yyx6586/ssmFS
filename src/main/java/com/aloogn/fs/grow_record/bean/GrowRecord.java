package com.aloogn.fs.grow_record.bean;

import java.io.Serializable;
import java.util.Date;

public class GrowRecord implements Serializable {
    private Integer id;

    private String account;

    private String gradeclass_id;

    private String description;

    private String name;

    private Date creat_time;

    private Date update_time;

    private String status;

    private String show_teacher;

    private String show_student;

    private String release_time;

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

    public String getGradeclass_id() {
        return gradeclass_id;
    }

    public void setGradeclass_id(String gradeclass_id) {
        this.gradeclass_id = gradeclass_id == null ? null : gradeclass_id.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getShow_teacher() {
        return show_teacher;
    }

    public void setShow_teacher(String show_teacher) {
        this.show_teacher = show_teacher == null ? null : show_teacher.trim();
    }

    public String getShow_student() {
        return show_student;
    }

    public void setShow_student(String show_student) {
        this.show_student = show_student == null ? null : show_student.trim();
    }

    public String getRelease_time() {
        return release_time;
    }

    public void setRelease_time(String release_time) {
        this.release_time = release_time == null ? null : release_time.trim();
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
        GrowRecord other = (GrowRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getGradeclass_id() == null ? other.getGradeclass_id() == null : this.getGradeclass_id().equals(other.getGradeclass_id()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCreat_time() == null ? other.getCreat_time() == null : this.getCreat_time().equals(other.getCreat_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getShow_teacher() == null ? other.getShow_teacher() == null : this.getShow_teacher().equals(other.getShow_teacher()))
            && (this.getShow_student() == null ? other.getShow_student() == null : this.getShow_student().equals(other.getShow_student()))
            && (this.getRelease_time() == null ? other.getRelease_time() == null : this.getRelease_time().equals(other.getRelease_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getGradeclass_id() == null) ? 0 : getGradeclass_id().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCreat_time() == null) ? 0 : getCreat_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getShow_teacher() == null) ? 0 : getShow_teacher().hashCode());
        result = prime * result + ((getShow_student() == null) ? 0 : getShow_student().hashCode());
        result = prime * result + ((getRelease_time() == null) ? 0 : getRelease_time().hashCode());
        return result;
    }
}