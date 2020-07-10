package com.atguigu.databaseTools;

import java.sql.*;


public class Jdbc {
   static final String url="jdbc:mysql://localhost:3306/test?useSSL=false";
   static final String username="root";
   static final String password="";
   public Jdbc() {
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
		   
	   }
	   catch(ClassNotFoundException e) {
		   e.printStackTrace();
	   }
   }
	   public Connection getConnection(){
		   
		   Connection connection=null;
		   try {
			   connection=DriverManager.getConnection(url,username,password);
			   
		   }
		   catch(SQLException e){
			   e.printStackTrace();
		   }
		   return connection;
	   }

}
