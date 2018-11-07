package com.ccg.springstruts2.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import com.ccg.springstruts2.beans.Person;


@WebServlet("/testServlet")
public class TestServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//1、从ApplicationContext域对象中获取IOC容器
		ServletContext servletContext = getServletContext();
		ApplicationContext ctx = (ApplicationContext)servletContext.getAttribute("applicationContext");
		
		//2、从IOC容器中获取bean
		Person person = ctx.getBean(Person.class);
		person.hello();
	}
}
