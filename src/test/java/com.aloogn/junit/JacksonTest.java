package com.aloogn.junit;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import sun.rmi.runtime.Log;

import java.util.List;
import java.util.TreeMap;

public class JacksonTest {
    String json = "{\"username\":\"zhangsan\",\"性别\":\"男\",\"company\":{\"companyName\":\"中华\",\"address\":\"北京\"},\"cars\":[\"奔驰\",\"宝马\"],\"logList\":[{\"id\":123,\"name\":\"abc\"},{\"id\":234,\"name\":\"efff\"}]}";
    ObjectMapper mapper = null;

    @Test
    public void getString(){
        mapper = new ObjectMapper();
        try {
            JsonNode rootNode = mapper.readTree(json);
            JsonNode userNameNode = rootNode.path("username");
            String userName = mapper.writeValueAsString(userNameNode);
            System.out.println("------》username:"+userName);

        }catch (Exception e){

        }
    }

    @Test
    public void getMap(){
        mapper = new ObjectMapper();
        try {
            JsonNode rootNode = mapper.readTree(json);
            JsonNode companyNode = rootNode.path("company");
            String company = mapper.writeValueAsString(rootNode);
            TreeMap<String,Object> companyMap = mapper.readValue(company, TreeMap.class);
            System.out.println("==company==");
            System.out.println(companyMap);
        }catch (Exception e){

        }
    }

    @Test
    public void getList(){
        mapper = new ObjectMapper();
        try {
            JsonNode rootNode = mapper.readTree(json);
            JsonNode logListNode = rootNode.path("logList");
            String logJson = mapper.writeValueAsString(logListNode);
            JavaType logType = mapper.getTypeFactory().constructParametricType(List.class, Log.class);
            List<Log> logList = mapper.readValue(logJson, logType);
            System.out.println("==logList==");
            System.out.println(logList);
        }catch (Exception e){
            System.out.println(e.getCause().getMessage());
        }

    }

}
