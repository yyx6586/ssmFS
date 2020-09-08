package com.aloogn.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSONUtil {
	private int code;//响应状态码
	private String msg;//响应状态描述
	private Object data;//响应数据

	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
}
