package com.jacliu.test.oms.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacliu.test.oms.user.feign.IUserServiceFeign;

@RestController
public class OmsUserController {

	public static final Logger LOG = LoggerFactory.getLogger(OmsUserController.class);

	@Autowired
	private IUserServiceFeign userServiceFeign;

	@RequestMapping("/test")
	public String test() {
		System.out.println("test ooo ,,,");
		return "test ooo";
	}

	@RequestMapping("/findUserOrders")
	public String findUserOrders() {
		return userServiceFeign.findOrder("100");
	}
}
