package servletproject;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logout extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie ck = new Cookie("fname", "");
		ck.setMaxAge(0);
		response.addCookie(ck);

		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.include(request, response);

	}

}
