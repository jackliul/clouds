package com.jacliu.test.oms.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("omsOrderFacade")
public interface OrderServiceFeign {

	@RequestMapping(value = "/findOrder", method = RequestMethod.GET)
	String findOrder(@RequestParam(value = "id") Integer orderId);
}