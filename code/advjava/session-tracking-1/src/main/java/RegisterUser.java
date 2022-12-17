

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register-user")
public class RegisterUser extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pin");
		String state = request.getParameter("state");
		int code=0;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd16aug","root","root");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO employee values(0,?,?,?,?,?,?)");
				stmt.setString(1, name);
				stmt.setString(2, email);
				stmt.setString(3, contact);
				stmt.setString(4, city);
				stmt.setString(5, pincode);
				stmt.setString(6, state);
			int cnt = stmt.executeUpdate();
			con.close();

			if(cnt>0) {
				code=1;
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	
		response.sendRedirect("user-info.jsp?c="+code);
	}

}














