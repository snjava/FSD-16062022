import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectJoinRecords {

	public static void main(String[] args) {
		String query = "SELECT s.id,name,contact,city,title,passingyr,percent FROM student s INNER JOIN stud_education e WHERE s.id=e.sid"; 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd16aug","root","root"); 
			PreparedStatement stmt = con.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("id") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("contact") + "\t");
				System.out.print(rs.getString("City") + "\t");
				System.out.print(rs.getString("title") + "\t");
				System.out.print(rs.getString("passingyr") + "\t");
				System.out.print(rs.getDouble("percent") + "\n");
			}
			
			
			stmt.close();
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
