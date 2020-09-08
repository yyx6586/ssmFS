package com.aloogn.junit;

import com.aloogn.fs.user.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.minidev.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class UserTest extends BaseTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void testSignIn() {
		ResultActions resultActions;

		ObjectMapper mapper = new ObjectMapper();
		JSONObject json = new JSONObject();
		json.put("account", "admin");
		json.put("password", "e10adc3949ba59abbe56e057f20f883e");

		JSONObject headerJSONObject = new JSONObject();
		headerJSONObject.put("commom",
				"{\"sid\":1,\"platform\":\"ios\",\"sign\":\"111\"}");
		try {
			resultActions = mockMvc.perform(MockMvcRequestBuilders
					.post("/signIn.do")
					.contentType(MediaType.APPLICATION_JSON)
					//.header("common",headerJSONObject.get("common"))
					.content(json.toJSONString()));
			 MvcResult mvcResult = resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
		        String result = mvcResult.getResponse().getContentAsString();
		        System.out.println("==========结果为：==========\n" + result + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("==========结果为：==========\n" + e.getMessage() + "\n");
		}
       
        
	}

	@Test
	public void getCodeJSON() {
		ResultActions resultActions;

		JSONObject json = new JSONObject();
		json.put("tel", "12312341234");
		json.put("type", "signUp");

		try {
			resultActions = mockMvc.perform(MockMvcRequestBuilders
					.post("/getCode.do")
					//.header("common","{\"sid\":\"1\",\"platform\":\"ios\",\"sign\":\"111\"}")
					.contentType(MediaType.APPLICATION_JSON)
					.content(json.toJSONString()));
			MvcResult mvcResult = resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("==========结果为：==========\n" + result + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("==========结果为：==========\n" + e.getMessage() + "\n");
		}


	}

	@Test
	public void getCodeFORM() {

		ResultActions resultActions;

		JSONObject headerJSONObject = new JSONObject();
//		String sign = MD5("platform");
		headerJSONObject.put("commom",
				"{\"sid\":1,\"platform\":\"ios\",\"sign\":\"111\"}");
		try {
			resultActions = mockMvc.perform(MockMvcRequestBuilders
					.post("/getCode.do")
					//.header("common","{\"sid\":\"1\",\"platform\":\"ios\",\"sign\":\"111\"}")
					.param("tel","123123")
					.param("type","signUp")
					.contentType(MediaType.APPLICATION_FORM_URLENCODED)
			);
			MvcResult mvcResult = resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("==========结果为：==========\n" + result + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("==========结果为：==========\n" + e.getMessage() + "\n");
		}


	}

	@Test
	public void testGet() {
		ResultActions resultActions;

		try {
			resultActions = mockMvc.perform(MockMvcRequestBuilders
					.get("/test.do")
			);
			MvcResult mvcResult = resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("==========结果为：==========\n" + result + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("==========结果为：==========\n" + e.getMessage() + "\n");
		}


	}

	@Test
	public void getCodeGet() {
		ResultActions resultActions;

		JSONObject headerJSONObject = new JSONObject();
//		String sign = MD5("platform");
		headerJSONObject.put("commom",
				"{\"sid\":1,\"platform\":\"ios\",\"sign\":\"111\"}");
		try {
			resultActions = mockMvc.perform(MockMvcRequestBuilders
					.get("/getCode.do")
					//.header("common","{\"sid\":\"1\",\"platform\":\"ios\",\"sign\":\"111\"}")
					.param("tel","123123")
					.param("type","signUp")
					.contentType(MediaType.APPLICATION_FORM_URLENCODED)
			);
			MvcResult mvcResult = resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
			String result = mvcResult.getResponse().getContentAsString();
			System.out.println("==========结果为：==========\n" + result + "\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("==========结果为：==========\n" + e.getMessage() + "\n");
		}


	}


	@Test
	public void file() throws Exception {
//		String result = mockMvc.perform(fileUpload("/file")
//				.file(new MockMultipartFile("file", "test.txt",
//						"multipart/form-data",
//						"hello upload".getBytes("UTF-8"))))
//				.andDo(print())
//				.andExpect(status().isOk())
//				.andReturn().getResponse().getContentAsString();
//		Assert.assertEquals("file", result);
	}
}
