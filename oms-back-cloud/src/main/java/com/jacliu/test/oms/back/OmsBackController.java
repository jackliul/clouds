package com.jacliu.test.oms.back;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OmsBackController {

	@Value("${foo}")
	String db;

	@Value("${jdbc.name}")
	String jdbcUserName;

	@RequestMapping("/foo")
	public String home() {
		return "Hello  " + db + " ,,, " + jdbcUserName;
	}
}
