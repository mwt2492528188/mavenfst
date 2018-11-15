package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bean.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.UserService;

@Controller
public class UserController {
	@Resource(name="userServiceImp")
	UserService userService;

	@RequestMapping("/page/{page}")
	public ModelAndView show(@PathVariable("page") int page) {
		PageHelper.startPage(page, 2);
		List<User> list = userService.selAllUser();
		PageInfo pg = new PageInfo(list);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("a");
		mv.addObject("list", list);
		mv.addObject("pg", pg);
		return mv;
	}
	@RequestMapping("/show")
	public ModelAndView show() {
		List<User> list = userService.selAllUser();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("a");
		mv.addObject("list", list);
		return mv;
	} 
	@RequestMapping("/aop")
	public String adddel(){
		
		User user=new User();
		user.setUsername("张三");
		user.setPwd("sfsdf");
		userService.adddelUser(user, 9);
		System.out.println("ok");
		return "b";
	}
}
