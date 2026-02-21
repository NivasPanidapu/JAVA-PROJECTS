import java.sql.*;

public class PatientDisplay {
    public static void main(String[] args) {
        // JDBC URL, username, and password of Oracle database
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "your_username";
        String password = "your_password";

        try {
            // Load Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect to Oracle database
            Connection con = DriverManager.getConnection(url, user, password);

            // Create SQL statement
            Statement stmt = con.createStatement();

            // Execute SQL query
            ResultSet rs = stmt.executeQuery("SELECT id, name, problem, bill FROM patients");

            // Display patient information
            System.out.println("Patient Information:");
            System.out.println("--------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String problem = rs.getString("problem");
                double bill = rs.getDouble("bill");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Problem: " + problem);
                System.out.println("Bill: $" + bill);
                System.out.println("--------------------");
            }

            // Close resources
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}