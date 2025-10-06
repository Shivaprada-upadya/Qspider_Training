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

@WebServlet("/viewall")
public class ViewAllServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms","root","Shiva_mysql@2025");
	
	PreparedStatement stmt=con.prepareStatement("select * from product");
	
	
//	stmt.setInt(1, Integer.parseInt(req.getParameter("id")));
//	stmt.setString(2, req.getParameter("name"));
//	stmt.setDouble(3, Double.parseDouble(req.getParameter("price")));
//	stmt.setString(4,req.getParameter("brand"));
	
	ResultSet result=stmt.executeQuery();
	

	req.setAttribute("rs",result);
	
	req.getRequestDispatcher("viewAll.jsp").forward(req, resp);
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		
			
			
		
		
		
	}
	
}
