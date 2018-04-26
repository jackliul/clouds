package com.jacliu.test.oms.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringOmsUserFacadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringOmsUserFacadeApplication.class, args);
	}
}
