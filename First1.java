package com.example;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;
import java.io.PrintWriter;


@WebServlet("/First1")
public class First1 implements Servlet
{
	ServletConfig config;
	public void init(ServletConfig config)
	{
		System.out.println("obj of Servlet Invok");
	}
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		
		res.setContentType("text/html");
		
		out.print("<html><body>");
		out.print("servlet code (service)");
		out.print("</body></html>");
	}
	
	public void destroy() {
		System.out.println("Servlet Termineted");
	}
	
	public ServletConfig getServletConfig() {//this is non life cycle method 
		return config;
	}
	
	public String getServletInfo() {
		return "DemoServlet";
	}
	
}