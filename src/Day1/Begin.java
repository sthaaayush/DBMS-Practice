package Day1;

import java.sql.*;

public class Begin {
	public static void main(String[] args) {
		String databsae = "jdbc:mysql://localhost:3306/jdbc_practice";
		String username = "root";
		String password = "";

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(databsae, username, password);
			System.out.println("Connection Established Successfully");

			statement = connection.createStatement();

			String query = "SELECT * FROM students";
			resultSet = statement.executeQuery(query);

			while (resultSet.next()) {
				System.out.println(resultSet.getInt("id"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
                System.out.println("Connection closed.");
            } catch (Exception e) {
                e.printStackTrace();
            }
		}
	}
}
