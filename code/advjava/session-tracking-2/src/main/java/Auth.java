

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/auth")
public class Auth extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String password = request.getParameter("upass");
		
		if("Admin".equals(name) && "Admin123".equals(password)) {
			//=======Cookie Creation============
			Cookie ck = new Cookie("user", name); // Create a Cookie
			ck.setMaxAge(60*60*24); // to set the Expire time  
			response.addCookie(ck); // send cookie to client side.
			
			//=======Session Creation===========
			HttpSession session = request.getSession(); // get the new session or existing session.
			session.setAttribute("un", name);
			
			// Home Page
			response.sendRedirect("home.jsp");
		} else {
			// Login Page
			response.sendRedirect("login.jsp?c=-1");
		}
	}

}
