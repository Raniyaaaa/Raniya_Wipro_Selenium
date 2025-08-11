//11.	Use PreparedStatement to insert multiple student records into the database.
package day_11_JDBC;

import java.sql.*;

public class InsertMultiStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con = DBConnect.getConnection()){
			PreparedStatement pst = con.prepareStatement("INSERT INTO Student VALUES (?, ?, ?)");
			pst.setInt(1, 6); pst.setString(2, "Riya"); pst.setFloat(3, 91); pst.executeUpdate();
			pst.setInt(1, 7); pst.setString(2, "Sam"); pst.setFloat(3, 84); pst.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

