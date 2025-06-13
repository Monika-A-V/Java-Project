package com.JDBCDemo;
import java.sql.*;
import java.util.Scanner;

public class AccessDBDynamic 
{
	Connection con;
	ResultSet rs;
	PreparedStatement prstm;
	
	
	AccessDBDynamic()
	{
		con=DBConnection.MyDBConnection();
	}
	public void fetchData() throws SQLException
	{
		prstm=con.prepareStatement("select * from employee",ResultSet.TYPE_SCROLL_INSENSITIVE,
	    ResultSet.CONCUR_UPDATABLE);
		rs=prstm.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt("eid")+ " " + rs.getString(2)+" "+rs.getInt(3));
		}
	}
	public void insertData() throws SQLException
	{
		prstm=con.prepareStatement("insert into employee values(?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter eid");
		int eid=sc.nextInt();
		System.out.println("enter ename");
		String ename=sc.next();
		System.out.println("enter salary");
		int salary=sc.nextInt();
		System.out.println("enter address");
		String address=sc.next();
		System.out.println("enter did");
		int did=sc.nextInt();
		
		prstm.setInt(1,eid);
		prstm.setString(2,ename);
		prstm.setInt(3,salary);
		prstm.setString(4,address);
		prstm.setInt(5,did);
		
		prstm.executeUpdate();
		System.out.println("insert successfully");
	}

	public void updateData(int id,int sal) throws SQLException
	{
		prstm=con.prepareStatement("update employee set salary=? where eid=?");
		prstm.setInt(1, id);
		prstm.setInt(2, sal);
		
		prstm.executeUpdate();
		System.out.println("update successfully");
	}
	public static void main(String[] args) 
	{
		AccessDBDynamic a=new AccessDBDynamic();
		
		try 
		{
			a.fetchData();
			System.out.println(",,,,,,,,,,,,,,,,");
			a.insertData();
			System.out.println(",,,,,,,,,,,,,");
			a.fetchData();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				a.rs.close();
				a.prstm.close();
				a.con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}

		
	}

}
