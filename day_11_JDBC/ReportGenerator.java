//18.	Write a JDBC-based report generator that exports data from a MySQL table to a text or CSV file.
package day_11_JDBC;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.*;

public class ReportGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3306/School";
        String dbUser = "root";
        String dbPassword = "root";

        String filePath = "Student_Report.csv";

        try (
            Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Student");
            PrintWriter writer = new PrintWriter(new FileWriter(filePath))
        ) {
            writer.println("ID,Name,Percentage");


            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                float percentage = resultSet.getFloat("percentage");
                writer.printf("%d,%s,%.2f%n", id, name, percentage);
            }

            System.out.println("Report generated successfully at: " + filePath);

        } catch (Exception e) {
            System.out.println("Error generating report: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

//Report generated successfully at: Student_Report.csv
