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

@WebServlet("/updatepage")
public class UpdateServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
				String id=req.getParameter("id");
				String name=req.getParameter("name");
				String email=req.getParameter("email");
				String phone=req.getParameter("phone");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","Shiva_mysql@2025");
				
				PreparedStatement stmt=con.prepareStatement("Update student set name=?,email=?,phone=? where id=?");
				
				stmt.setString(1,name);
				stmt.setString(2,email);
				stmt.setString(3,phone);
				stmt.setString(4,id);
				
				if(stmt.executeUpdate()>0)
				{
					req.getRequestDispatcher("viewall").forward(req, resp);
				}
				else
				{
					System.out.println("not updated");
				}
				
				stmt.close();
				con.close();
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
