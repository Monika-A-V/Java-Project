package com.JDBCDemo;
import java.sql.*;
public class DBConnection 
{
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String CONNECTION_URL="jdbc:mysql://localhost:3306/company";
	public static final String USER="root";
	public static final String PASSWORD= "root";
	public static Connection con=null;
	
	public static Connection MyDBConnection()
	{
		try
		{
			Class.forName(JDBC_DRIVER);
			
			try
			{
				con=DriverManager.getConnection(CONNECTION_URL,USER,PASSWORD);
				System.out.println(con);
				return con;
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args)
	{
		System.out.println(DBConnection.MyDBConnection());

	}

}
