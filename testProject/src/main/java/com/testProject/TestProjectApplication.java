package com.testProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
		
	
	}
	
	@Bean
	public RestTemplate restTemplet() {
		
		return new RestTemplate();
	}


}
