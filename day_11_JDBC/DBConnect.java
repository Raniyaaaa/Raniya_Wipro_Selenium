//1.	Write a Java program to connect to a MySQL database using JDBC.
package day_11_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/School", "root", "root");
    }
}
