package com.aloogn.junit;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration("src/main/resouces")
@ContextConfiguration(locations={"classpath:spring/spring-mvc.xml","classpath:spring/applicationContext.xml"})
//加上@Transactional 事物管理注解以后，单元测试执行完后会撤销对数据库的修改。
//想看增删改的结果的话，可以把这个注解先注释。
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional 
public class BaseTest {
	
	private static Logger log = LoggerFactory.getLogger(BaseTest.class);
	
    @Autowired  
    private WebApplicationContext wac;  
    protected MockMvc mockMvc;  
    
    @Before  
    public void setUp() {  
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();  
    }  

}
