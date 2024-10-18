package Day1;

import java.sql.*;

public class Begin {
	public static void main(String[] args) {
		String databsae = "jdbc:mysql://localhost:3306/jdbc_practice";
		String username = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(databsae, username, password);
			System.out.println("Connection Established Successfully");
			
			Statement stm= con.createStatement();
			
			String query="SELECT * FROM students";
			ResultSet rs=stm.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt("id"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
