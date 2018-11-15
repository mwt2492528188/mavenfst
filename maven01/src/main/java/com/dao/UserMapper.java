package com.dao;

import java.util.List;

import tk.mybatis.mapper.common.Mapper;

import com.bean.User;

public interface UserMapper extends Mapper<User> {

	// 查询所有的user对象
	List<User> selAllUser();

}