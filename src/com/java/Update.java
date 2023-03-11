package com.java;

import java.sql.*;

public class Update 
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
		     
			 String qry=("update emp set eno=4,ename='Chikku' where eno=3");
			  s.executeUpdate(qry);
			 
			  
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

		





	
