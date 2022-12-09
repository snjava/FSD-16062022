
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auth-user")
public class Validate extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username= request.getParameter("uname");
		String password= request.getParameter("pass");
		
		if("Admin".equals(username) && "Admin123".equals(password)) {
			// Go To Home page
			RequestDispatcher dis = request.getRequestDispatcher("home");
			dis.forward(request, response);
		}
		else {
			// Go to Error Page
			response.sendRedirect("error");
		}
		
		
	}

}
