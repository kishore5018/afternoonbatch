<%@page import="org.hibernate.Transaction"%>
<%@page import="userbean.userbean"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
String username=request.getParameter("user");
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory factory=cfg.buildSessionFactory();
Session session2=factory.openSession();
Transaction transaction=session2.beginTransaction();
Query query=session2.createQuery("from userbean where username=:user");
query.setString("user", username);
userbean u=(userbean)query.uniqueResult();
session2.delete(u);
transaction.commit();
response.sendRedirect("fetch.jsp");
}catch(Exception e){
	System.out.println(e);
}
%>
</body>
</html>