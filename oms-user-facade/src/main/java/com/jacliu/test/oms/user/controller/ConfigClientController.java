package com.jacliu.test.oms.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

	public static final Logger LOG = LoggerFactory.getLogger(ConfigClientController.class);

	@RequestMapping("/foo")
	public String home() {
		return "dfdf ";
	}
}
