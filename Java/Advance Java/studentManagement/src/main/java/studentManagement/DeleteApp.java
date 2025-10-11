package studentManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/studentmanagement";
		String username="root";
		String password="Shiva_mysql@2025";
		
		System.out.println("Enter id: ");
		int id=sc.nextInt();
//		System.out.println("Enter name: ");
//		String name=sc.next();
//		System.out.println("Enter email: ");
//		String email = sc.next();
//		System.out.println("Enter phone: ");
//		long phone=sc.nextLong();
//		System.out.println("Enter course: ");
//		String course = sc.next();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,username,password);
			
			PreparedStatement stmt = con.prepareStatement("delete from student where sid=?");
			
			stmt.setInt(1, id);
			
			
			stmt.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}
