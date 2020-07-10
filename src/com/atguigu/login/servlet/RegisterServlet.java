package com.atguigu.login.servlet;

import com.atguigu.databaseTools.databaseFunction;
import com.atguigu.userDevelopment.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name=" RegisterServlet")
public class RegisterServlet {
     protected void doPost(HttpServletRequest request, HttpServletResponse response) {
    	 String firstname=request.getParameter("firstname");
    	 String lastname=request.getParameter("lastname");
    	 String email=request.getParameter("email");
    	 if (firstname!=""&&lastname!=""&&email!="") {
    		 user user =new user(firstname, lastname, email);
    		 databaseFunction databaseFunction=new databaseFunction(user);
    		 boolean result=databaseFunction.isRegister();
    		 if (!result) {
    			 try {
					response.sendRedirect("login.jsp");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
    		 }
    		 else {
    			 request.setAttribute("message", "Register Fail");
    			 try {
					request.getRequestDispatcher("/register.jsp").forward(request,response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		 }
  
    	 }
    	 else {
    		 try {
				request.getRequestDispatcher("/register.jsp").forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	 }
    	 
     }
     protected void doGet(HttpServletRequest request,HttpServletResponse response) {
		
	}
}
