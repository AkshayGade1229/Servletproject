package servletproject;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Delete extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
        String id = req.getParameter("id");

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javab2", "root", "root");

			PreparedStatement ps = con.prepareStatement("delete from empoloyee where id = ?");
			
			ps.setString(1, id);
			
			int result = ps.executeUpdate();

			if (result == 1) {
				req.setAttribute("SuccessMsg", "Delete Employee  Successfully...!");
			} else {
				req.setAttribute("error", "Uneble to add data");
			}

		} catch (Exception e) {
			System.out.println(e);
			req.setAttribute("error", "Uneble to add data ");

		}
		RequestDispatcher rd = req.getRequestDispatcher("deleteemp.jsp");
		rd.forward(req, res);
		}
	}
