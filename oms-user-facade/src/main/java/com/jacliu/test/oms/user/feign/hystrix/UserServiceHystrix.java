package com.jacliu.test.oms.user.feign.hystrix;

import com.jacliu.test.oms.user.feign.IUserServiceFeign;

public class UserServiceHystrix implements IUserServiceFeign {

	@Override
	public String findOrder(String orderId) {
		return "default ,,, order 100 :: " + orderId;
	}

}
