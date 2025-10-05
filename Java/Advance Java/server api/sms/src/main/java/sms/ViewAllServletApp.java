package sms;

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

@WebServlet("/viewall")
public class ViewAllServletApp extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(" view all loaded");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","Shiva_mysql@2025");
			System.out.println("view Connection ...");
			PreparedStatement stmt = con.prepareStatement("select * from student");
			System.out.println("View Statement created");
			ResultSet result=stmt.executeQuery();
			System.out.println("execute Query");
			
			req.setAttribute("rs", result);
			
			req.getRequestDispatcher("viewall.jsp").forward(req, resp);
			
			result.close();
			stmt.close();
			con.close();
			
			
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}
}
