package servletproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Getall extends HttpServlet {
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		 try {
	        	Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javab2", "root",
						"root");
				PreparedStatement ps = con.prepareStatement("SELECT * FROM empoloyee");

			
	                ResultSet rs = ps.executeQuery();
	                
	                ArrayList<Registration_entities> emplist = new ArrayList<>();
	                while (rs.next()) {
		
	               int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String lastname = rs.getString("lastname");
	                String mobno = rs.getString("mobno");
	                String emailid = rs.getString("emailid");
	                String address = rs.getString("address");
	                String password = rs.getString("password");
	                
	             
	                Registration_entities e = new Registration_entities(id, name,lastname,mobno,emailid,address,password);
	                   emplist.add(e);
	                }
                req.setAttribute("getall", emplist);
                
		 
		 RequestDispatcher rd = req.getRequestDispatcher("getall.jsp");
		 rd.forward(req, res);
	
	
		 }catch (ClassNotFoundException e) {
			 e.printStackTrace();
			
		}
		 catch (SQLException e) {
			 e.printStackTrace();
		}
	}

}
