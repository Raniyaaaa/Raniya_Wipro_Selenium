//4.	Develop a program to search a student by ID using JDBC

package day_11_JDBC;

import java.sql.*;
import java.util.*;

public class SearchStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DBConnect.getConnection()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID to search: ");
            int id = sc.nextInt();

            PreparedStatement pst = con.prepareStatement("SELECT * FROM Student WHERE id = ?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("Student: " + rs.getString("name") + " " + rs.getFloat("percentage"));
            } else {
                System.out.println("Student not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}


//Enter ID to search: 2
//Student: Asha 65.4


