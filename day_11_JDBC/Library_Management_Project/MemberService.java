package Library_Management_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberService {

	public static void registerMember(Scanner sc) {
		try (Connection con = DBConnection.getConnection()) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Phone: ");
            String phone = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();

            String sql = "INSERT INTO members (name, phone, address) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, address);
            ps.executeUpdate();

            System.out.println("Member registered successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public static void viewMembers() {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "SELECT * FROM members";
            ResultSet rs = con.createStatement().executeQuery(sql);
            System.out.printf("%-5s %-20s %-15s %-30s\n", "ID", "Name", "Phone", "Address");
            while (rs.next()) {
                System.out.printf("%-5d %-20s %-15s %-30s\n",
                        rs.getInt("member_id"), rs.getString("name"),
                        rs.getString("phone"), rs.getString("address"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
