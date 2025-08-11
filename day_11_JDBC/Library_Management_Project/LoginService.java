package Library_Management_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {
	public static boolean login(String username, String password) throws SQLException, Exception {
		try(Connection con = DBConnection.getConnection()) {
			String query = "Select * from staff where username=? AND password =?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			return rs.next();
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
