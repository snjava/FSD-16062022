

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet-intro")
public class ServletIntro extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is the first servlet....");
		response.setContentType("text/html"); // setting a type of response
		PrintWriter out = response.getWriter(); // to return response create this object
		out.print("<h1 style='color:red;'>Welcome To First Response from Serlvet...</h1>"); // return as a response to end user.		
	}

}
