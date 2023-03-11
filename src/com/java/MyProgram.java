package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyProgram 
{
public static void main(String[] args) 
{
	
	try 
	{  
	   //step 1:Load the Driver class
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   
	   //step 2:Establish connection
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
	   
	   //step 3:Prepare sql query
	   Statement s=con.createStatement();
	   
	   //step 4:Execute statement
	   s.executeUpdate("create table emp(eno int,ename varchar(50))");
	   
	   //step 5:close connection
	   s.close();
	   con.close();
	} 
	catch (ClassNotFoundException e) 
	{
		e.printStackTrace();
	} catch (SQLException e) 
	{
		e.printStackTrace();
	}
		
	}

}