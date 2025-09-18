package shivaprada;

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
public class InsertApp extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException
	{
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","Shiva_mysql@2025");
				PreparedStatement ps=con.prepareStatement("insert into student values (?,?,?)");
				ps.setString(1, req.getParameter("id"));
				ps.setString(2, req.getParameter("name"));
				ps.setString(3, req.getParameter("age"));
				ps.executeUpdate();
				req.getRequestDispatcher("home.jsp").forward(req,res);
				
			} 
			
			catch (ClassNotFoundException | SQLException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
	}
	
}

