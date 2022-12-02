import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {
	public static void main(String[] args) {
		//String query = "INSERT INTO product VALUES(1, 'SmartPhone', 33221.22, 5)";
		String query = "INSERT INTO product VALUES(2, 'SmartTV', 63221.22, 2),(3, 'SmartWatch', 13221.22, 10),(4, 'SmartSpeaker', 5221.22, 5)";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd16aug","root","root");
			PreparedStatement stmt = con.prepareStatement(query);
			int count = stmt.executeUpdate();
			con.close();
			
			System.out.println(count + " : rows inserted....");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
