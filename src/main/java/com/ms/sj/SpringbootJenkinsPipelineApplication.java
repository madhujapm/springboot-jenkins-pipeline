package com.ms.sj;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsPipelineApplication {

	public static Logger logger=LoggerFactory.getLogger(SpringbootJenkinsPipelineApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Pipeline Application started");
	}
	public static void main(String[] args) {
		logger.info(" Pipeline Application executed");
		logger.info("I am running here in pipeline");
		SpringApplication.run(SpringbootJenkinsPipelineApplication.class, args);
	}

}
