package com.aloogn.common.utils;


import com.mysql.cj.util.StringUtils;
import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import net.minidev.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 
 */
public class TokenUtil {
	private static Logger log = LoggerFactory.getLogger(TokenUtil.class);
	
    /**
     * 1.创建一个32-byte的密匙
     */
    private static final byte[] secret = "aeiwodianfasffjsifoldjikolaijqwe".getBytes();


    //生成一个token
    public static String creatToken(Map<String,Object> payloadMap) throws JOSEException {

        //3.先建立一个头部Header
        /**
         * JWSHeader参数：1.加密算法法则,2.类型，3.。。。。。。。
         * 一般只需要传入加密算法法则就可以。
         * 这里则采用HS256
         *
         * JWSAlgorithm类里面有所有的加密算法法则，直接调用。
         */
        JWSHeader jwsHeader = new JWSHeader(JWSAlgorithm.HS256);

        //建立一个载荷Payload
        Payload payload = new Payload(new JSONObject(payloadMap));

        //将头部和载荷结合在一起
        JWSObject jwsObject = new JWSObject(jwsHeader, payload);

        //建立一个密匙
        JWSSigner jwsSigner = new MACSigner(secret);

        //签名
        jwsObject.sign(jwsSigner);

        //生成token
        return jwsObject.serialize();

    }


    /**
     * 解析token 是否过期
     * @param token
     * @return
     * @throws ParseException
     * @throws JOSEException
     */
    public static Map<String,Object> valid(String token) throws ParseException, JOSEException {
    	if(StringUtils.isNullOrEmpty(token)) {
    		throw new NullPointerException();
    	}

    	//解析token
        JWSObject jwsObject = JWSObject.parse(token);

        //获取到载荷
        Payload payload=jwsObject.getPayload();

        //建立一个解锁密匙
        JWSVerifier jwsVerifier = new MACVerifier(secret);

        Map<String, Object> resultMap = new HashMap<String, Object>();
        //判断token
        if (jwsObject.verify(jwsVerifier)) {
            resultMap.put("Result", 0);
            //载荷的数据解析成json对象。
            JSONObject jsonObject = payload.toJSONObject();
            resultMap.put("data", jsonObject);

            //判断token是否过期
            if (jsonObject.containsKey("exp")) {
                Long expTime = Long.valueOf(jsonObject.get("exp").toString());
                Long nowTime = new Date().getTime();
                //判断是否过期
                if (nowTime > expTime) {
                    //已经过期
                    resultMap.clear();
                    resultMap.put("Result", 2);
                }
            }
        }else {
            resultMap.put("Result", 1);
        }

        return resultMap;

    }
    
    public static String validToken(String token) throws ParseException, JOSEException {
    	
        Map<String, Object> validMap = valid(token);
        Integer i =  (Integer) validMap.get("Result");
        if (i == 0) {
//            JSONObject jsonObject = (JSONObject) validMap.get("data");
//            System.out.println("jsonObject----->"+jsonObject.toJSONString());
//            
//            String tUid = (String)jsonObject.get("uid");
//            String tSign = (String)jsonObject.get("sign");
//            
//            if(uid.equals(tUid) && sign.equals(tSign)) {
//            	log.debug("--------token解析成功------");
//            	return "ok";
//            }else {
//            	log.debug("--------token会话错误------");
//            	return "会话错误";
//            }
        } else if (i == 2) {
        	log.debug("--------token已经过期------");
        	return "会话过期";
        }
        
        return "会话错误";
    }
    
}