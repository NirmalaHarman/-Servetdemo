package com.servet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{  
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException   
{  
  int a = Integer.parseInt(req.getParameter("num1"));
  int b = Integer.parseInt(req.getParameter("num2"));

  int c = a*b;
  int d = a+b;
  System.out.println("Multi is :" +c);
  System.out.println("addition is :" +d);
  
  PrintWriter out = res.getWriter();
  out.println("addition is" +d);
  out.println("Multi : is"+c);
   
 }
}
