

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display-msg")
public class Display extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String message = request.getParameter("msg");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>"+name+", User Send a Message..</h1>");
		out.print("<h2>"+message+"</h2>");
	}

}
