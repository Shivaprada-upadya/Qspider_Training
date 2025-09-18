package jdbc.insertValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class DynamicInsert {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/emp";
		String username="root";
		String password="Shiva_mysql@2025";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			PreparedStatement stmt = con.prepareStatement("insert into emp_table vales(?,?,?,?)");
			
			stmt.setString(1, sc.next());
			stmt.setString(2, sc.next());
			stmt.setString(3, sc.next());
			stmt.setString(4, sc.next());
			
			
			stmt.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
