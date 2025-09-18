package jdbc.updateValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValue {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/emp";
		String userName="root";
		String password="Shiva_mysql@2025";
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection con=DriverManager.getConnection(url,userName,password);
			
			Statement st=con.createStatement();
			
			st.execute("update emp_table set eid='19' where eid='1'");
			
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
