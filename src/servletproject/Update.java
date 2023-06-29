package servletproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.Registration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Update")
public class Update extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String lastname = req.getParameter("lastname");
		String mobno = req.getParameter("mobno");
		String emailid = req.getParameter("emailid");
		String address = req.getParameter("address");
		String password = req.getParameter("password");
	

	
	
			try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/javab2","root","root");
	             
	           PreparedStatement ps = con.prepareStatement("update empoloyee set name = ?, lastname = ? ,mobno = ?, address = ?, emailid = ?, password = ?  where id = ?");
	           
	             ps.setString(1, name);
	             ps.setString(2, lastname);
	             ps.setString(3, mobno);
	             ps.setString(4, emailid);
	             ps.setString(5, address);
	             ps.setString(6, password);
	             ps.setInt(7, id);
	             
	             
	             Registration_entities e=  new Registration_entities(id,name,lastname,mobno,emailid,address,password );
	           
	             req.setAttribute("empData",e);
				int rs = ps.executeUpdate();
				
				if (rs == 1) {
					req.setAttribute("SuccessMsg", "Employee Updated Successfully...!");
				} else {
					req.setAttribute("error", "Uneble to Update data");
				}
	            System.out.println(rs);
	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	      
	        RequestDispatcher rd = req.getRequestDispatcher("updateemp.jsp");
                rd.forward(req, res);
	    }
	 
	}

