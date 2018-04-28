package com.jacliu.test.oms.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.jacliu.test.oms.user.feign.OrderServiceFeign;
import com.jacliu.test.oms.user.service.IUserService;

public class UserServiceImpl implements IUserService {

	@Autowired
	private OrderServiceFeign orderServiceFeign;

	@Value("{jdbc.username}")
	private String username;

	@Value("{jdbc.password}")
	private String password;

	@Override
	public String findUser(Integer id) {
		return "username:: " + username + " ,,, password " + password + " /n orderMsg "
				+ orderServiceFeign.findOrder(id);
	}

}
