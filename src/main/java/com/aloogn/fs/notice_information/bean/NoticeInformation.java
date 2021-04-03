package com.aloogn.fs.notice_information.bean;

import java.io.Serializable;
import java.util.Date;

public class NoticeInformation implements Serializable {
    private Integer id;

    private String account;

    private String grade_id;

    private String title;

    private Date creat_time;

    private Date update_time;

    private String showBadge;

    private String information;

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

    public String getGrade_id() {
        return grade_id;
    }

    public void setGrade_id(String grade_id) {
        this.grade_id = grade_id == null ? null : grade_id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getShowBadge() {
        return showBadge;
    }

    public void setShowBadge(String showBadge) {
        this.showBadge = showBadge == null ? null : showBadge.trim();
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information == null ? null : information.trim();
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
        NoticeInformation other = (NoticeInformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getGrade_id() == null ? other.getGrade_id() == null : this.getGrade_id().equals(other.getGrade_id()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCreat_time() == null ? other.getCreat_time() == null : this.getCreat_time().equals(other.getCreat_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getShowBadge() == null ? other.getShowBadge() == null : this.getShowBadge().equals(other.getShowBadge()))
            && (this.getInformation() == null ? other.getInformation() == null : this.getInformation().equals(other.getInformation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getGrade_id() == null) ? 0 : getGrade_id().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCreat_time() == null) ? 0 : getCreat_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getShowBadge() == null) ? 0 : getShowBadge().hashCode());
        result = prime * result + ((getInformation() == null) ? 0 : getInformation().hashCode());
        return result;
    }
}