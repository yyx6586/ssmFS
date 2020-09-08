package com.aloogn.junit;

import com.aloogn.fs.redis.service.RedisService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class RedisTest extends BaseTest {
	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RedisService redisService;
	
	@Test
	public void test() {


//        redisService.set("user",new String("2222"));
		String str = redisService.get("user").toString();
        log.debug("----------"+ str +"---------");
		
	}
}
