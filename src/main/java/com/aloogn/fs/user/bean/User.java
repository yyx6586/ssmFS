package com.aloogn.fs.user.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String id;

    private String name;

    private String sex;

    private String birthdate;

    private String password;

    private String role;

    private String state;

    private String email;

    private String phone;

    private String QQ;

    private String wechat;

    private String address;

    private Date creat_time;

    private Date update_time;

    private String parent_name;

    private String parent_phone;

    private String parent_QQ;

    private String parent_wechat;

    private String parent_address;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate == null ? null : birthdate.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ == null ? null : QQ.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name == null ? null : parent_name.trim();
    }

    public String getParent_phone() {
        return parent_phone;
    }

    public void setParent_phone(String parent_phone) {
        this.parent_phone = parent_phone == null ? null : parent_phone.trim();
    }

    public String getParent_QQ() {
        return parent_QQ;
    }

    public void setParent_QQ(String parent_QQ) {
        this.parent_QQ = parent_QQ == null ? null : parent_QQ.trim();
    }

    public String getParent_wechat() {
        return parent_wechat;
    }

    public void setParent_wechat(String parent_wechat) {
        this.parent_wechat = parent_wechat == null ? null : parent_wechat.trim();
    }

    public String getParent_address() {
        return parent_address;
    }

    public void setParent_address(String parent_address) {
        this.parent_address = parent_address == null ? null : parent_address.trim();
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBirthdate() == null ? other.getBirthdate() == null : this.getBirthdate().equals(other.getBirthdate()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getRole() == null ? other.getRole() == null : this.getRole().equals(other.getRole()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getQQ() == null ? other.getQQ() == null : this.getQQ().equals(other.getQQ()))
            && (this.getWechat() == null ? other.getWechat() == null : this.getWechat().equals(other.getWechat()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getCreat_time() == null ? other.getCreat_time() == null : this.getCreat_time().equals(other.getCreat_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getParent_name() == null ? other.getParent_name() == null : this.getParent_name().equals(other.getParent_name()))
            && (this.getParent_phone() == null ? other.getParent_phone() == null : this.getParent_phone().equals(other.getParent_phone()))
            && (this.getParent_QQ() == null ? other.getParent_QQ() == null : this.getParent_QQ().equals(other.getParent_QQ()))
            && (this.getParent_wechat() == null ? other.getParent_wechat() == null : this.getParent_wechat().equals(other.getParent_wechat()))
            && (this.getParent_address() == null ? other.getParent_address() == null : this.getParent_address().equals(other.getParent_address()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBirthdate() == null) ? 0 : getBirthdate().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getQQ() == null) ? 0 : getQQ().hashCode());
        result = prime * result + ((getWechat() == null) ? 0 : getWechat().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getCreat_time() == null) ? 0 : getCreat_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getParent_name() == null) ? 0 : getParent_name().hashCode());
        result = prime * result + ((getParent_phone() == null) ? 0 : getParent_phone().hashCode());
        result = prime * result + ((getParent_QQ() == null) ? 0 : getParent_QQ().hashCode());
        result = prime * result + ((getParent_wechat() == null) ? 0 : getParent_wechat().hashCode());
        result = prime * result + ((getParent_address() == null) ? 0 : getParent_address().hashCode());
        return result;
    }
}