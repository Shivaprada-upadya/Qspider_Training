package jdbc.insertValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValue {

	public static void main(String[] args)  {
		
		
		

		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Shiva_mysql@2025");
		System.out.println("Connected");
		
		Statement stmt=con.createStatement();
		stmt.execute("insert into emp_table values ('15','prada','80000','Software Developer')");
	
		System.out.println(stmt.getUpdateCount()== 1? "row inserted" : "Row not inserted");
		
		stmt.close();
		con.close();
		}
		
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}

//"jdbc:mysql://localhost:3306/emp","root","Shiva_mysql@2025"
//String url="jdbc:mysql://localhost:3306/emp";
//String username="root";
//String password="Shiva_mysql@2025";