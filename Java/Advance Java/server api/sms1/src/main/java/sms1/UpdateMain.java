package sms1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updatemain")
public class UpdateMain extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms1","root","Shiva_mysql@2025");
			System.out.println("Update Main Connnection ---------------");
			PreparedStatement stmt =con.prepareStatement("update sms1 set name=?, email=?,phone=? where id=?");
			System.out.println("Update Main Statement   ---------------");
			stmt.setString(1,name);
			stmt.setString(2,email);
			stmt.setLong(3,phone);
			stmt.setInt(4,id);
			//ResultSet result= stmt.executeQuery();
			if(stmt.executeUpdate()>0)
				req.getRequestDispatcher("viewall").forward(req, resp);
			else
				System.out.println("not updated");
					
			
			//System.out.println("Update Main Result Set  ---------------");
			//req.setAttribute("res", result);
			
			//result.close();
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
