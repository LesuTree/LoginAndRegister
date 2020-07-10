package com.atguigu.databaseTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.atguigu.userDevelopment.*;
public class databaseFunction {
    private user user;
    private Jdbc jdbc=new Jdbc();
    private Connection connection=jdbc.getConnection();
	public databaseFunction(user user) {
		this.user=user;
	}
	public boolean isRegister() {
		String sql="insert into user(firstname,lastname,email) values('"+user.getName()+"','"+user.getLastname()+"','"+user.getEamil()+"')";
		boolean result=false;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			result=preparedStatement.execute();
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	public boolean isLogin() {
		String sql="select * from user where firstname='"+user.getName()+"' and lastname = '"+user.getLastname()+"' and email = '"+user.getEamil()+"'";
		boolean result =false;
		ResultSet resultSet=null;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				result=true;
			}
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	public void closeConnection() {
		try {
			connection.close();
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
