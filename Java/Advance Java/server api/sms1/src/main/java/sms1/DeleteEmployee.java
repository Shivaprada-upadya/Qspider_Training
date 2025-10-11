package sms1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delete")
public class DeleteEmployee extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id= Integer.parseInt(req.getParameter("id"));
		System.out.println("Delete Employee Stated -----------");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Delete Employee Driver -----------");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sms1","root","Shiva_mysql@2025");
			System.out.println("Delete Employee Connection -----------");
			PreparedStatement stmt = con.prepareStatement("delete from sms1 where id=?");
			stmt.setInt(1, id);
			
			
			if(stmt.executeUpdate()>0)
				req.getRequestDispatcher("viewall").forward(req, resp);
			else
			{
				System.out.println("Not deleted ..........");
			}
			
			
			stmt.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
