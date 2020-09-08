package com.aloogn.common.utils;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import sun.rmi.runtime.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConvertUtil {

    public static Document str2XML(String xmlString) throws DocumentException {
        return  DocumentHelper.parseText(xmlString);
    }

    /**
     * 字符转时间
     * @param dateStr
     * @param formatStrs 格式
     * @return
     */
    public static Date date2Str(String dateStr, String... formatStrs) {
        SimpleDateFormat sDateFormat=new SimpleDateFormat(formatStrs.length > 0?formatStrs[0]:"yyyy-MM-dd HH:mm:ss");
        try {
            return sDateFormat.parse(dateStr);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 	字符转map
     */
    public static TreeMap<String,Object> string2TreeMap(String jsonStr){
        TreeMap<String,Object> treeMap = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(jsonStr);
            String strMap = objectMapper.writeValueAsString(rootNode);
            treeMap = objectMapper.readValue(strMap, TreeMap.class);
        }catch (Exception e){

        }
        return treeMap;
    }

    //字符转List
    public static List string2List(String jsonStr){
        List list = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode rootNode = objectMapper.readTree(jsonStr);
            String logJson = objectMapper.writeValueAsString(rootNode);
            JavaType logType = objectMapper.getTypeFactory().constructParametricType(List.class, Log.class);
            list = objectMapper.readValue(logJson, logType);
        }catch (Exception e){

        }
        return list;
    }

    public static Map<String,String> getStringToMap(String str){
        //感谢bojueyou指出的问题
        //判断str是否有值
        if(null == str || "".equals(str)){
            return null;
        }
        //根据&截取
        String[] strings = str.split(",");
        //设置HashMap长度
        int mapLength = strings.length;
        //判断hashMap的长度是否是2的幂。
        if((strings.length % 2) != 0){
            mapLength = mapLength+1;
        }

        Map<String,String> map = new HashMap<>(mapLength);
        //循环加入map集合
        for (int i = 0; i < strings.length; i++) {
            //截取一组字符串
            String[] strArray = strings[i].split("=");
            //strArray[0]为KEY  strArray[1]为值
            map.put(strArray[0],strArray[1]);
        }
        return map;
    }
}
