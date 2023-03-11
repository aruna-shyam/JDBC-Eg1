package com.java;

import java.sql.*;
public class Select 
{
public static void main(String[] args) 
{
	Connection con=null;
	Statement s=null;
	try 
	{
		//Load the Driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//Establish the Connection
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
		
		//Prepare sql statement:
	     s=con.createStatement();
		
		//execute query
	     
		 String qry=("select * from emp");
		 ResultSet rs=s.executeQuery(qry);
		 while (rs.next()==true)
		 {
			 System.out.println(rs.getInt("eno"));
			 System.out.println(rs.getNString("ename"));
		 }
		  
		  
	} 
   catch (ClassNotFoundException e) 
	{
		e.printStackTrace();
	} 
   catch (SQLException e) 
	{
		e.printStackTrace();
	}
	finally
	{
		//closing connection:
		try
		{ 
			if(s!=null)
			{
			  s.close();
			  
			}
			if(con !=null)
			{
			  con.close();
			  
			}
				
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
		
	}
}

	





		
	
