//3.	Write a JDBC program to fetch and display all student records from the database
package day_11_JDBC;

import java.sql.*;

public class DisplayStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Connection con = DBConnect.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("Select * from student")) {
			System.out.println("ID\tName\tPercentage");
				while(rs.next()) {
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
				}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

//ID	Name	Percentage
//1	Ravi	80.5
//2	Asha	65.4
//3	Neha	99.0
//4	Arjun	72.5
//5	Meera	88.3
//6	Riya	91.0
//7	Sam	84.0
