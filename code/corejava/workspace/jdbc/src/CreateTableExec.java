import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTableExec {
	public static void main(String[] args) {
		String query = "CREATE TABLE product(id int PRIMARY KEY, name varchar(30), price double, qty int)"; 
		try {
			
			//1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Create Connection  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd16aug","root","root"); 
			//3. Create statement 
			PreparedStatement stmt = con.prepareStatement(query);
			//4. Execute Statement
			int count = stmt.executeUpdate();
			//5. close Connection
			stmt.close();
			con.close();
			
			System.out.println("Table Created.. Count : " + count);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
