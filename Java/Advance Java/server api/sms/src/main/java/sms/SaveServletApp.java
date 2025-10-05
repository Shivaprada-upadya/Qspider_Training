package sms;

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


@WebServlet("/save")
public class SaveServletApp  extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","Shiva_mysql@2025");
			
			PreparedStatement stmt = con.prepareStatement("insert into student values(?,?,?,?)");
			
			
			stmt.setString(1,id);
			stmt.setString(2,name);
			stmt.setString(3,email);
			stmt.setString(4,phone);
			
			if(stmt.executeUpdate()==1)
			{
				System.out.println("addded");
				req.getRequestDispatcher("home.jsp").forward(req,resp);
			}
			else
			{
				System.out.println("Student not added");
			}
			
			
			
			
		}
		catch(SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
	}
}
