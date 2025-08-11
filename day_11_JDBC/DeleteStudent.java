//6.	Write a Java program to delete a student record from the database using JDBC.
package day_11_JDBC;

import java.sql.*;
import java.util.Scanner;

public class DeleteStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DBConnect.getConnection()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID to delete: ");
            int id = sc.nextInt();

            PreparedStatement pst = con.prepareStatement("DELETE FROM Student WHERE id = ?");
            pst.setInt(1, id);
            int rows = pst.executeUpdate();
            System.out.println(rows + " row deleted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}

//Enter ID to delete: 3
//1 row deleted.