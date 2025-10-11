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

@WebServlet("/save")
public class SaveServlet extends HttpServlet{
	
		
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		long phone=Long.parseLong(req.getParameter("phone"));
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms1","root","Shiva_mysql@2025");
			System.out.println("Save Servlet Connection created......");
			PreparedStatement stmt = con.prepareStatement("insert into sms1 values(?,?,?,?)");
			
			stmt.setInt(1, id);
			stmt.setString(2,name);
			stmt.setString(3,email);
			stmt.setLong(4,phone);
			System.out.println("Save Servlter Statement Created.......");
					
					if(stmt.executeUpdate()>0)
					{
						req.getRequestDispatcher("home.jsp").forward(req, resp);
					}
					else
					{
						System.out.println("Employees not added...");
					}
			
			
			stmt.close();
			con.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
