package com.aloogn.fs.score.bean;

import java.io.Serializable;
import java.util.Date;

public class Score implements Serializable {
    private String id;

    private String score_name;

    private String score_time;

    private String score_address;

    private String score_teacher;

    private String score;

    private Date creat_time;

    private Date update_time;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getScore_name() {
        return score_name;
    }

    public void setScore_name(String score_name) {
        this.score_name = score_name == null ? null : score_name.trim();
    }

    public String getScore_time() {
        return score_time;
    }

    public void setScore_time(String score_time) {
        this.score_time = score_time == null ? null : score_time.trim();
    }

    public String getScore_address() {
        return score_address;
    }

    public void setScore_address(String score_address) {
        this.score_address = score_address == null ? null : score_address.trim();
    }

    public String getScore_teacher() {
        return score_teacher;
    }

    public void setScore_teacher(String score_teacher) {
        this.score_teacher = score_teacher == null ? null : score_teacher.trim();
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
            && (this.getScore_name() == null ? other.getScore_name() == null : this.getScore_name().equals(other.getScore_name()))
            && (this.getScore_time() == null ? other.getScore_time() == null : this.getScore_time().equals(other.getScore_time()))
            && (this.getScore_address() == null ? other.getScore_address() == null : this.getScore_address().equals(other.getScore_address()))
            && (this.getScore_teacher() == null ? other.getScore_teacher() == null : this.getScore_teacher().equals(other.getScore_teacher()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getCreat_time() == null ? other.getCreat_time() == null : this.getCreat_time().equals(other.getCreat_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getScore_name() == null) ? 0 : getScore_name().hashCode());
        result = prime * result + ((getScore_time() == null) ? 0 : getScore_time().hashCode());
        result = prime * result + ((getScore_address() == null) ? 0 : getScore_address().hashCode());
        result = prime * result + ((getScore_teacher() == null) ? 0 : getScore_teacher().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getCreat_time() == null) ? 0 : getCreat_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        return result;
    }
}