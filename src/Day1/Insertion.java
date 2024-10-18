package Day1;

import java.sql.*; 
import Day1.DatabaseConnection;

public class Insertion {
    public static void main(String[] args) {
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = null;

        try {
            if (connection != null) {
                String query = "INSERT INTO students (name, age) VALUE (?,?)";
                statement = connection.prepareStatement(query);

                statement.setString(1, "JhonDoe");
                statement.setInt(2, 20);

                int status = statement.executeUpdate();
                if (status > 0) {
                    System.out.println("Data entry successful");
                } else {
                    System.out.println("Data entry unsuccessful");
                }
            } else {
                System.out.println("Failed to establish connection.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection(connection, statement);
        }
    }
}
