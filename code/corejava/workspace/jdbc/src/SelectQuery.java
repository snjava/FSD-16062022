import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectQuery {
	public static void main(String[] args) {
		String query = "SELECT * FROM product WHERE qty<=5";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd16aug","root","root");
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getDouble("price")+ "\t");
				System.out.println(rs.getInt("qty"));
			}
			
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
