package com.JDBCDemo;
import java.sql.*;

public class AccessCallable
{
	
    CallableStatement stm;
	ResultSet rs;
	Connection con;
	
	AccessCallable()
	{
		con=DBConnection.MyDBConnection();
	}

	
	public void callfun(int n1) throws SQLException
	{
		stm=con.prepareCall("{?=call Factorial(?)}");
		
		stm.setInt(2, n1);
		stm.registerOutParameter(1,Types.INTEGER);
		
		boolean status=stm.execute();
		if(status==true)
		{
			System.out.println(stm.getInt(1));
		}
	}
	/*public void callpro(int did) throws SQLException
	{
		stm=con.prepareCall("{call FindRecords(?)}");
		stm.setInt(1, did);
		boolean status=stm.execute();
		if(status==true)
		{
			rs=stm.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}
	}*/
	public static void main(String[] args)
	{
		AccessCallable b=new AccessCallable();
		
		try {
			b.callfun(3);
			//b.callpro(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}


}
