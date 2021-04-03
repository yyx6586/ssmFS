package com.aloogn.fs.user.service.impl;

import com.aloogn.common.utils.TokenUtil;
import com.aloogn.fs.redis.service.RedisService;
import com.aloogn.fs.user.bean.AuthUser;
import com.aloogn.fs.user.bean.User;
import com.aloogn.fs.user.bean.UserCriteria;
import com.aloogn.fs.user.mapper.UserMapper;
import com.aloogn.fs.user.service.UserService;
import com.nimbusds.jose.JOSEException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RedisService redisService;

    @Override
    public AuthUser signIn(String account, String password, HttpServletRequest request) throws Exception {

        //检查账号是否存在
        UserCriteria example = new UserCriteria();
        example.createCriteria().andIdEqualTo(account);

        List<User> list = userMapper.selectByExample(example);

        AuthUser authUser = null;
        authUser = new AuthUser();

        if(list.size() > 1){
            authUser.setMsg("存在多个帐号,请联系管理员");
            return authUser;
//            new Exception("存在多个帐号,请联系管理员");
        }

        if(list.size() <= 0){
            authUser.setMsg("帐号不存在");
            return authUser;
//            new Exception("帐号不存在");
        }

        //检查密码
        User user = list.get(0);
        if(!user.getPassword().equals(password)){
            authUser.setMsg("密码错误");
            return authUser;
//            new Exception("密码错误");
        }

//        String uid = request.getHeader("uid");
//        String version = request.getHeader("version");
        try{
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("account", user.getId()+""); // 用户id
//            map.put("uid", uid); // app uid
//            map.put("version", version); // app version
            map.put("sta", new Date().getTime());// 生成时间
            map.put("exp", new Date().getTime() + 30*24*60*6*1000); // 过期时间

            //生成token
            String token = TokenUtil.creatToken(map);

//            //将登录用户的uid存入缓存,
//            redisService.hashSet(Constant.REDIS_TOKEN_KEY,user.getId()+"",token);


            authUser.setUserId(user.getId());
            authUser.setUserPassword(user.getPassword());
            authUser.setUserName(user.getName());
            authUser.setRole(user.getRole());
            authUser.setToken(token);
        }catch (JOSEException e){
            e.printStackTrace();
            throw new Exception("登录错误");
        }
        return authUser;
    }

    @Override
    public void updatePassword(String account, String password, String resetPassword, String token) throws Exception {

        //检查愿密码是否正确
        User user = userMapper.selectByPrimaryKey(account);
        if(user == null && !user.getPassword().equals(password)){
            new Exception("原密码不正确");
        }

//        //删除token，需要重新登录
//        redisService.hashDelete(Constant.REDIS_TOKEN_KEY,account+"");

        //修改密码
        user = new User();
        user.setId(account);
        user.setPassword(resetPassword);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void personalInformationFamily(String account, String studentName, String studentSex, String phone, String QQ, String wechat, String address, String parentName, String parentPhone, String parentQQ, String parentWechat, String parentAddress, String token) throws Exception {
        //根据账号进行修改信息
        User user = userMapper.selectByPrimaryKey(account);
        if(user == null){
            new Exception("账号不正确，请联系管理员");
        }

        //修改信息
        user = new User();
        user.setId(account);
        user.setName(studentName);
        user.setSex(studentSex);
        user.setPhone(phone);
        user.setQQ(QQ);
        user.setWechat(wechat);
        user.setAddress(address);
        user.setParent_name(parentName);
        user.setParent_phone(parentPhone);
        user.setParent_QQ(parentQQ);
        user.setParent_wechat(parentWechat);
        user.setParent_address(parentAddress);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void personalInformationSchool(String account, String name, String sex, String phone, String QQ, String wechat, String email, String address, String token) throws Exception {
        //根据账号进行修改信息
        User user = userMapper.selectByPrimaryKey(account);
        if(user == null){
            new Exception("账号不正确，请联系管理员");
        }

        //修改信息
        user = new User();
        user.setId(account);
        user.setName(name);
        user.setSex(sex);
        user.setPhone(phone);
        user.setQQ(QQ);
        user.setWechat(wechat);
        user.setAddress(address);
        user.setEmail(email);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User familyPersonalDetails(String account, String token) throws Exception {
        //根据账号进行查询
        User user = userMapper.selectByPrimaryKey(account);
        return user;
    }
//
//    @Override
//    public List<User> findPassword(String account, HttpServletRequest request) throws Exception {
//        //检查账号是否存在
//        UserCriteria example = new UserCriteria();
//        example.createCriteria().andIdEqualTo(account);
//
//        List<User> list = userMapper.selectByExample(example);
//
//        if(list.size() > 1){
//            new Exception("存在多个帐号,请联系管理员");
//        }
//
//        if(list.size() <= 0){
//            new Exception("帐号不存在");
//        }
//
////        //检查密码
////        User user = list.get(0);
////
////        AuthUser authUser = new AuthUser();
////        authUser.setUserId(user.getId());
////        authUser.setUserName(user.getName());
////        authUser.setUserPassword(user.getPassword());
////        authUser.setParentPhone(user.getParent_phone());
////        authUser.setUserSex(user.getSex());
////        authUser.setRole(user.getRole());
////        authUser.setUserPhone(user.getPhone());
//        return list;
//    }


}
