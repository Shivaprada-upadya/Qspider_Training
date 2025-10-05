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


@WebServlet("/update")
public class UpdatePage extends HttpServlet{

		
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String id=req.getParameter("id");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","Shiva_mysql@2025");
			
			PreparedStatement stmt = con.prepareStatement("select * from student where id=?");
			
			stmt.setString(1,id);
			
			ResultSet result =stmt.executeQuery();
			
			result.next();
			
			req.setAttribute("res", result);
			
			req.getRequestDispatcher("updatepage.jsp").forward(req, resp);
			
			
			result.close();
			stmt.close();
			con.close();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
