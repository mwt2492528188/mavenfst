package com.service;

import java.util.List;

import com.bean.User;

public interface UserService {
	
	//查询所有的user对象
		List<User> selAllUser();
		
		boolean adddelUser(User user,Integer id);

}
