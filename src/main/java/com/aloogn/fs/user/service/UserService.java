package com.aloogn.fs.user.service;


import com.aloogn.fs.user.bean.AuthUser;
import com.aloogn.fs.user.bean.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Service
public interface UserService {
    AuthUser signIn(String account, String name, String password, HttpServletRequest request) throws Exception;

    void updatePassword(String account, String password, String resetPassword, String token) throws Exception;

    void personalInformationFamily(String account, String studentName, String studentSex, String phone, String QQ, String wechat, String address, String parentName, String parentPhone, String parentQQ, String parentWechat, String parentAddress, String token) throws Exception;

    void personalInformationSchool(String account, String name, String sex, String phone, String QQ, String wechat, String email, String address, String token) throws Exception;

    User familyPersonalDetails(String account, String token) throws Exception;

//    List<User> findPassword(String account, HttpServletRequest request) throws Exception;

}