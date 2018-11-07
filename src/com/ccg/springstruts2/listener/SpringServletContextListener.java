package com.ccg.springstruts2.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringServletContextListener implements ServletContextListener{

	public SpringServletContextListener(){}
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		//1、获取spring配置文件的名称
		ServletContext servletContext = arg0.getServletContext();
		String config = servletContext.getInitParameter("contextConfigLocation");
		
		//2、创建IOC容器
		ApplicationContext ctx = new ClassPathXmlApplicationContext(config);
		
		//3、把IOC容器放到属性ctx中
		servletContext.setAttribute("applicationContext", ctx);
	}

}
