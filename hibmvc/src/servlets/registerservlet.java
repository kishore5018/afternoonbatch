package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.registerdao;
import userbean.userbean;

public class registerservlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) {
		
		userbean user=new userbean();
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		user.setEmail(request.getParameter("email"));
		registerdao.register(user);
		
		
		
	}
	
	

}
