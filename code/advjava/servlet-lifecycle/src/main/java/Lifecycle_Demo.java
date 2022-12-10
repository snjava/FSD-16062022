

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lifecycle-demo")
public class Lifecycle_Demo extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		System.out.println("This is Init Method");
	}

	public void destroy() {
		System.out.println("This is Destory Method");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is Service Method");
	}	

}
