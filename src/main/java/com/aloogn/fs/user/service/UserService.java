package com.aloogn.fs.user.service;


import com.aloogn.fs.user.bean.AuthUser;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Service
public interface UserService {
    AuthUser signIn(String account, String password, HttpServletRequest request) throws Exception;
    void updatePassword(String account, String password, String resetPassword, String token) throws Exception;
    void personalInformationFamily(String account, String studentName, String studentSex, String parentName, String parentPhone, String token) throws Exception;


}