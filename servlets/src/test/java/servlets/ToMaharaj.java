package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ToMaharaj extends GenericServlet{

	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
         PrintWriter writer = res.getWriter();
         writer.println("Welcome to the Maharaj Website");
	}
	
	

}
