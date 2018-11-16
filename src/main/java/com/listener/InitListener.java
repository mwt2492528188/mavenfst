package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("--------------监听启动----------");
		ServletContext context = arg0.getServletContext();
		context.setAttribute("cxt", context.getContextPath());
		context.setAttribute("css", context.getContextPath()+"/css/");
		context.setAttribute("cxt", context.getContextPath()+"/js/");

	}

}
