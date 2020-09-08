package com.aloogn.common.utils;

public class Constant {

    //客户端签名key
    public static final String CLIENT_SIGN = "1as2jfa3jkfda.jkakk" ;
    //白名单
    //访问成功信息
    public static final String SUCCESS_MSG = "ok";
    //访问失败信息
    public static final String ERROR_MSG = "error";
    //访问成功
    public static final int CODE_SUCCESS = 200;
    //访问错误 服务器不理解请求的语法。
    public static final int CODE_ERROR = 400;
    //请求要求身份验证。 对于需要登录的网页，服务器可能返回此响应。。
    public static final int SESSION_CODE_ERROR = 401;

    //redis用户登录缓存信息
    public static final String REDIS_TOKEN_KEY="token_key";
    public static final String REDIS_LOGIN_USER_UID_KEY="login_user_uid";//登录的uid
    public static final String REDIS_LOGIN_USER_ID_KEY="login_user_id";//登录的id
    public static final String REDIS_GET_CODE_KEY="get_code_key";//存验证码



}
