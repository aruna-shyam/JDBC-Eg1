package com.java;

import java.sql.*;

public class Insert 
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
	     
		 String qry=("insert into emp values(1,'Aruna')");
		  s.executeUpdate(qry);
		  String qry1=("insert into emp values(2,'Dudu')");
		  s.executeUpdate(qry1);
		  String qry2=("insert into emp values(3,'Bubu')");
		  s.executeUpdate(qry2);
		  
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

	



