package Day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnection {
	private static final String jdbcURL = "jdbc:mysql://localhost:3306/jdbc_practice"; // Replace with your DB name
	private static final String username = "root"; // Default username, adjust if needed
	private static final String password = ""; // Set your MySQL password

	public static Connection getConnection() {
		Connection connection = null;
		try {
			// Load MySQL JDBC Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Establish a connection
			connection = DriverManager.getConnection(jdbcURL, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	// Method to close Connection, PreparedStatement, and ResultSet
	public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet) {
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
			System.out.println("Resources closed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Overloaded method to close Connection and PreparedStatement only
	public static void closeConnection(Connection connection, PreparedStatement statement) {
		closeConnection(connection, statement, null);
	}
}
