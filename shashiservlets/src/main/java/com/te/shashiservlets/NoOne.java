package com.te.shashiservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NoOne extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		String parameter = req.getParameter("uname");
		String parameter2 = req.getParameter("upass");
//		String[] parameterValues = req.getParameterValues("sports");
//		for(int i=0;i<parameterValues.length;i++) {
//			writer.println(parameterValues[i]);
//		}
		writer.println("welcome boss");
		writer.println("<hr>Welcome"+parameter+"</hr>");
		writer.println("<hr>Welcome\"+parameter2+\"</hr>");
		writer.println("welcome");
		req.setAttribute(parameter, parameter2);
		RequestDispatcher
		
	}

}
