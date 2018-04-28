package com.jacliu.test.oms.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jacliu.test.oms.user.feign.hystrix.UserServiceHystrix;

@FeignClient(name = "OMSORDERFACADE", fallback = UserServiceHystrix.class)
public interface IUserServiceFeign {

	@RequestMapping(value = "/findOrder")
	String findOrder(@RequestParam(value = "orderId") String orderId);
}
