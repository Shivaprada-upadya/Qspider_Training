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


@WebServlet("/viewall")
public class ViewAllEmployees extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("View All Start----------");
//		int id=Integer.parseInt(req.getParameter("id"));
//		String name=req.getParameter("name");
//		String email=req.getParameter("email");
//		long phone=Long.parseLong(req.getParameter("phone"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("View All Driver Class----------");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms1","root","Shiva_mysql@2025");
			System.out.println("ViewAll Connection Cerated-----------");
			PreparedStatement stmt = con.prepareStatement("select * from sms1");
			
			ResultSet result =stmt.executeQuery();
			System.out.println("ViewAll Query Executed...........");
			req.setAttribute("rs", result);
			
			req.getRequestDispatcher("viewallpage.jsp").forward(req, resp);
			
			result.close();
			stmt.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
