package com.js.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email= req.getParameter("email");
		int password=Integer.parseInt(req.getParameter("password"));
		if(email.equals("abc@gmail.com") && password==12345) {
			RequestDispatcher rd=req.getRequestDispatcher("home.html");
			rd.forward(req, res);
		}else {
			PrintWriter pw=res.getWriter();
			pw.write("<html><body> <p style=\"color:red\">Email or Password wrong</p></body></html>");
			
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
			
		}
		
	}

}
