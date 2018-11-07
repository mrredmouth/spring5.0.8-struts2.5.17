<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="UTF-8"%>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@ page import="org.springframework.context.ApplicationContext"%>
<%@ page import="com.ccg.springstruts2.beans.Person"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  
  	<%
  		// 1、从application域对象中得到IOC容器的实例，application是内置对象，翻译到java中，可直接用
  		ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(application);
  		//2、从IOC容器中得到bean
  		Person person = ctx.getBean(Person.class);
  		//3、使用bean
  		person.hello();
  	%>
  
  
	<!-- 测试自己创建的IOC容器 -->
    <a href="/ss/testServlet">TestServlet 验证IOC整合到上下文作用域对象中</a> 
    <br>
    
	<!-- 测试IOC容器中struts2的action -->
    <a href="/ss/personSave">person-save 验证action整合到IOC容器中</a> 
    
    
  </body>
</html>
