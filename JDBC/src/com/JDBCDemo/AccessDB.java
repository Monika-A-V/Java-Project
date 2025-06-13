package com.JDBCDemo;
import java.sql.*;
public class AccessDB
{
	Connection con=null;
	Statement stm=null;
	ResultSet rs=null;
	
	AccessDB()
	{
		con=DBConnection.MyDBConnection();
	}
	
	public void fetchData() throws SQLException
	{
		stm=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs=stm.executeQuery("select * from employee");
		
		
		//rs.absolute(2);
		//rs.updateString(2,"ninad");
		//rs.updateRow();
		
		rs.absolute(2);
		while(rs.next())
		{
			System.out.println(rs.getInt("eid")+ " " + rs.getString(2)+" "+rs.getInt(3));
		}
		System.out.println(",,,,,,,,,,,");
		
		//rs.afterLast();
		//while(rs.previous())
		//{
		//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		//}
	}
	public void insertData() throws SQLException
	{
		stm=con.createStatement();
		int x=stm.executeUpdate("insert into employee values(103,'geeta,78000,'nagpur',1)");
		if(x>0)
		{
			System.out.println("inserted successfully");
		}
	}
	public void updateData(int id) throws SQLException
	{
		stm=con.createStatement();
		int x=stm.executeUpdate("update employee set salary=60000 where eid=" +id);
		if(x>0)
		{
			System.out.println("update successfully");
		}
	}
	
	public void searchEmp(int id) throws SQLException

	{
		stm=con.createStatement();
		rs=stm.executeQuery("select * from employee where eid = "+id);
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
	public void deleteEmp(int id) throws SQLException
	{
		stm=con.createStatement();
		stm.executeUpdate("delete from employee where eid= "+id);
		System.out.println("deleted successfully");
		
		
	}
public static void main(String[] args) 
	
	{
		AccessDB a=new AccessDB();
		try
		{
			a.fetchData();
			System.out.println(",,,,,,,,,,,,,,,,,,,,,");
			//a.insertData();
			//System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,");
			//a.fetchData();
			System.out.println(",,,,,,,,,,,,,,,,,,,");
			a.updateData(101);
			System.out.println(",,,,,,,,,,,,,,,,,,,,,,");
			a.fetchData();
			System.out.println(",,,,,,,,,,,,,,,,,,,");
			a.searchEmp(102);
			System.out.println(",,,,,,,,,,,,,,,,,,,,");
			a.deleteEmp(106);
			a.fetchData();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

		
	}

}
