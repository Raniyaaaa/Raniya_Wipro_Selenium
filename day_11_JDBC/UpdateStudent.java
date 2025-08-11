//5.	Implement an update operation to modify student details in the database using JDBC.
package day_11_JDBC;

import java.sql.*;
import java.util.Scanner;

public class UpdateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DBConnect.getConnection()) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter ID to update: ");
            int id = sc.nextInt();
            System.out.print("Enter new percentage: ");
            float perc = sc.nextFloat();

            PreparedStatement pst = con.prepareStatement("UPDATE Student SET percentage = ? WHERE id = ?");
            pst.setFloat(1, perc);
            pst.setInt(2, id);
            int rows = pst.executeUpdate();
            System.out.println(rows + " row updated.");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}

//Enter ID to update: 3
//Enter new percentage: 90
//1 row updated.