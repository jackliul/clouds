package com.jacliu.test.oms.back;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OmsBackController {

	@RequestMapping("/findOrder")
	public String findOrder(String orderId) {
		System.out.println("order:: " + orderId);
		return "调到order服务器咯哦哦哦哦哦哦，:: " + orderId;
	}
}
