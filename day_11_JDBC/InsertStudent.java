//2.	Create a Java class to insert student records into a database table.
package day_11_JDBC;

import java.sql.*;

public class InsertStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DBConnect.getConnection()) {
            String sql = "INSERT INTO Student VALUES (?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, 5);
            pst.setString(2, "Meera");
            pst.setFloat(3, 88.3f);
            pst.executeUpdate();
            System.out.println("Student inserted.");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}

//Student inserted.