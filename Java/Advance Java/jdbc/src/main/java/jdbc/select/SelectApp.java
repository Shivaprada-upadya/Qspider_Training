package jdbc.select;

import java.sql.*;

public class SelectApp {

	public static void main(String[] args) {
		

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","Shiva_mysql@2025");
			
			PreparedStatement stmt = con.prepareStatement("select * from emp_table");
			
			ResultSet res= stmt.executeQuery();
			
			while(res.next()) {
				System.out.print(res.getString(1) + "\t");
				System.out.print(res.getString(2) + "\t");
				System.out.print(res.getString(3) + "\t");
				System.out.println(res.getString(4) + "\t");
			}
			
			res.close();
			stmt.close();
			con.close();
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
