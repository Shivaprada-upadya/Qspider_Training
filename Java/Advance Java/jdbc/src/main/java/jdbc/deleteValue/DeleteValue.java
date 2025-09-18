package jdbc.deleteValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/emp";
		String username="root";
		String password="Shiva_mysql@2025";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded successfully");
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connected ---------");
			
			Statement st=con.createStatement();
			
			st.execute("delete from emp_table where eid='2'");
		} 
		
		
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
