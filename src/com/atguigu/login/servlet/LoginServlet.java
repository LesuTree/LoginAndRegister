package com.atguigu.login.servlet;

import com.atguigu.userDevelopment.*;
import com.atguigu.databaseTools.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
     protected void  doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 String firstname=request.getParameter("firstname");
    	 String lastname=request.getParameter("lastname");
    	 String email=request.getParameter("email");
    	 if (firstname!=""&&lastname!=""&&email!="") {
    		 user user=new user(firstname,lastname,email);
    		 databaseFunction databaseFunction=new databaseFunction(user);
    		 boolean result =databaseFunction.isLogin();
    		 System.out.println(result);
    		 if (result) {
    			 request.getRequestDispatcher("/loin.jsp").forward(request, response);
    			 
    		 }
    		 else {
    			 request.setAttribute("message", "Login Fail");
    			 request.getRequestDispatcher("/login.jsp").forward(request, response);
    			
    		 }
    		 
    		 
    	 }
    	 else {
    		 request.getRequestDispatcher("/login.jsp").forward(request, response);
    	 }
     }
     protected void doGet(HttpServletRequest request,HttpServletResponse response) {
    	 
     }
}
