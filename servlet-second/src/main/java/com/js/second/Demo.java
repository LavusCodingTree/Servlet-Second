package com.js.second;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo extends HttpServlet {
	
	static {
		
		System.out.println("Static Initilizer");
	}
	{
		System.out.println("Non-Static Initilizer");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		
		PrintWriter pw=resp.getWriter();
		pw.print("Hello");
	}

}
