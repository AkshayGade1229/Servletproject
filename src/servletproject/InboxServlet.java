package servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class InboxServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		HttpSession Session = req.getSession(false);
		String loggedUser = (String) Session.getAttribute("loggedUser");
		
		if (loggedUser == null) {
			
			req.setAttribute("error", "Logined Frist..");
			RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
			rd.include(req, res);
			}else {
				PrintWriter pw = res.getWriter(); 
				pw.write("Welcome To Riyality"+loggedUser+"");
				pw.write("<a href='logout'Logout</a>");
				
			}
	}

}
