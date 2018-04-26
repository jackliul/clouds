package com.jacliu.test.oms.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("userService")
public interface UserServiceFeign {

	@RequestMapping(value = "/findUser", method = RequestMethod.GET)
	String findUser(@RequestParam(value = "id") Integer userId);
}