

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user-message")
public class Message extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>User Message</title>");
			out.print("</head>");
			
			out.print("<body>");
				out.print("<div align='center'>");
				out.print("<form action='display-msg'>");
					out.print("Name : <input type='text' name='name'/>");
					out.print("<br/><br/>");
					out.print("Message : <input type='text' name='msg'/>");
					out.print("<br/><br/>");
					out.print("<button type='Submit'>Send</button>");
				out.print("</form>");
				out.print("</div>");
			out.print("</body>");
		out.print("</html>");
	}

}
