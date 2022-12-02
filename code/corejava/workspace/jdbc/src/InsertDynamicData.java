import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicData {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = scan.nextInt();
		System.out.println("Enter Name : ");
		String name = scan.next();
		System.out.println("Enter Price : ");
		double price = scan.nextDouble();
		System.out.println("Enter Quantity : ");
		int qty = scan.nextInt();
		scan.close();

		String query = "INSERT INTO product VALUES(?,?,?,?)"; // Parameterized Query
		//String query = "DELETE FROM product WHERE id=?"; // Parameterized Query

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd16aug", "root", "root");
			PreparedStatement stmt = con.prepareStatement(query);
			// setting a value for the parameterized query
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setDouble(3, price);
			stmt.setInt(4, qty);
			
			int count = stmt.executeUpdate();
			con.close();

			System.out.println(count + " : rows inserted....");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
