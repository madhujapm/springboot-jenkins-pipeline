package com.ms.sj;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsPipelineApplicationTests {
	public static Logger logger=LoggerFactory.getLogger(SpringbootJenkinsPipelineApplicationTests.class);


	@Test
	void contextLoads() {
		logger.info("Pipeline Test case executing..");
		logger.info("Pipeline Test case executing logger 2..");
		assertEquals(true, true );
	}

}
