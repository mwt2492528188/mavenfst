package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class HomeController {
	@RequestMapping("/home")
	public String home(){
		
		return "home";}

}
