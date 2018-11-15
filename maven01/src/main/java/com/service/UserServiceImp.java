package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.User;
import com.dao.UserMapper;

@Service
public class UserServiceImp implements UserService {

	@Resource(name = "userMapper")
	UserMapper userMapper;

	@Override
	public List<User> selAllUser() {

		return userMapper.selAllUser();
	}

	@Override
	public boolean adddelUser(User user, Integer id) {
		userMapper.insert(user);
		// int s=Integer.parseInt("aa");
		userMapper.deleteByPrimaryKey(id);
		return true;
	}

}
