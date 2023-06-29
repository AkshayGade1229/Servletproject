package servletproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Select extends HttpServlet {
	


	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int id =Integer.parseInt(req.getParameter("id"));
        try {
        	Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javab2", "root",
					"root");
			PreparedStatement ps = con.prepareStatement("select * from empoloyee where id = ?");

			ps.setInt(1, id);
                ResultSet rs = ps.executeQuery();
                rs.next();
                
                String name = rs.getString("name");
                String lastname = rs.getString("lastname");
                String mobno = rs.getString("mobno");
                String emailid = rs.getString("emailid");
                String address = rs.getString("address");
                String password = rs.getString("password");
             
                Registration_entities e = new Registration_entities(id,name,lastname,mobno,emailid,address,password);
            req.setAttribute("empData", e);
            System.out.println(rs);
            
            System.out.println(rs.getString("id"));
            con.close();
        }catch (Exception e) {
			System.out.println(e);
		}
        RequestDispatcher rd = req.getRequestDispatcher("getemp.jsp");
		rd.forward(req, res);
		

			
		}  {
			
		}

	}


