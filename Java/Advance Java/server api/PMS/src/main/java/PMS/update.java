package PMS;

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

@WebServlet("/updateBy")
public class update extends HttpServlet{

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
int id= Integer.parseInt(req.getParameter("id"));
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pms","root","Shiva_mysql@2025");
			
			PreparedStatement stmt=con.prepareStatement("update product set name=?,price=?,brand=? where id=?");
			
			
			stmt.setString(1, req.getParameter("name"));
			
			stmt.setDouble(2, Double.parseDouble(req.getParameter("price")));
			
			stmt.setString(3,req.getParameter("brand"));
			stmt.setInt(4, Integer.parseInt(req.getParameter("id")));
			
			if(stmt.executeUpdate()==1) {
				req.getRequestDispatcher("viewall").forward(req, resp);
			}
			
			//ResultSet result=stmt.executeQuery();
			//result.next();
			
			//req.setAttribute("res",result);
			
			//req.getRequestDispatcher("viewall").forward(req, resp);
			

			
			stmt.close();
			con.close();
		} 
		catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
