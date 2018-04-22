package com.jacliu.test.oms.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringOmsUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOmsUserApplication.class, args);
	}
}
