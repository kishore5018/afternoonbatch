<%@page import="userbean.userbean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
<h1>USER DETAILS</h1>
<table border="2">
<tr>
<th>UserName</th>
<th>PassWord</th>
<th>Email</th>
<th>To Do's</th>
</tr>

<%
try{
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session2=factory.openSession();
	List ll=session2.createQuery("from userbean").list();
	Iterator itr=ll.iterator();
	while(itr.hasNext()){
		userbean user=(userbean)itr.next();
	%>
	<tr>
	<td><%=user.getUsername() %></td>
	<td><%=user.getPassword() %></td>
	<td><%=user.getEmail() %></td>
	<td><a href="edit.jsp?user=<%=user.getUsername() %>">EDIT</a>   <a href="delete.jsp?user=<%=user.getUsername() %>">DELETE</a></td>
	
	</tr>
	
	
	
	
	<% 
	
	
	
	}
	
	
}catch(Exception e){
	System.out.println(e);
}


%>





</table>
<a href="index.jsp">HOME</a>

</body>
</html>