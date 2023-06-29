package servletproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Addemp extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String fname = req.getParameter("name");
		String lname = req.getParameter("lastname");
		String phone = req.getParameter("mobno");
		String email = req.getParameter("email");
		String Address = req.getParameter("Address");
		String pass = req.getParameter("pass");

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javab2", "root", "root");

			PreparedStatement ps = con.prepareStatement(
					"insert into empoloyee (`name`,`lastname`,`mobno`,`emailid`,`address`,`password`) values( ?,?,?,?,?,? )");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, phone);
			ps.setString(4, Address);
			ps.setString(5, email);
			ps.setString(6, pass);

			int result = ps.executeUpdate();

			if (result == 1) {
				req.setAttribute("SuccessMsg", "Employee Added Successfully...!");
			} else {
				req.setAttribute("error", "Uneble to add data");
			}

		} catch (Exception e) {
			System.out.println(e);
			req.setAttribute("error", "Uneble to add data ");

		}
		RequestDispatcher rd = req.getRequestDispatcher("addemp.jsp");
		rd.forward(req, res);

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(phone);
		System.out.println(Address);
		System.out.println(email);
		System.out.println(pass);

	}

}
