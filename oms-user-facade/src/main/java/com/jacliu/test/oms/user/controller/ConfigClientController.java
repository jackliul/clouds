package com.jacliu.test.oms.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

	public static final Logger LOG = LoggerFactory.getLogger(ConfigClientController.class);

	@Value("${foo}")
	String db;

	@Value("${jdbc.name}")
	String jdbcUserName;

	@RequestMapping("/foo")
	public String home() {
		LOG.error("测试 日志噢噢噢噢 哦噢噢噢噢  ！！！");
		return "Hello  " + db + " ,,, " + jdbcUserName;
	}
}
