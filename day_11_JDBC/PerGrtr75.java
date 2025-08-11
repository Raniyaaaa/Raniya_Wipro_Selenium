//10.	Write a program to display all students whose percentage is greater than 75 using JDBC and SQL WHERE clause.
package day_11_JDBC;

import java.sql.*;

public class PerGrtr75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con = DBConnect.getConnection()){
			PreparedStatement pst = con.prepareStatement("SELECT * FROM Student WHERE percentage > 75");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) System.out.println(rs.getString(2) + " " + rs.getFloat(3));

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

//Ravi 80.5
//Meera 88.3
//Riya 91.0
//Sam 84.0

