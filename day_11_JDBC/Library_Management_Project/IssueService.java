package Library_Management_Project;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class IssueService {
	public static void issueBook(Scanner sc) {
        try (Connection con = DBConnection.getConnection()) {
            System.out.print("Enter Member ID: ");
            int memberId = sc.nextInt();
            System.out.print("Enter Book ID: ");
            int bookId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Issue Date (YYYY-MM-DD): ");
            String issueDate = sc.nextLine();
            System.out.print("Enter Due Date (YYYY-MM-DD): ");
            String dueDate = sc.nextLine();

            // Check book availability
            String checkSql = "SELECT available FROM books WHERE book_id = ?";
            PreparedStatement checkPs = con.prepareStatement(checkSql);
            checkPs.setInt(1, bookId);
            ResultSet rs = checkPs.executeQuery();
            if (rs.next() && !rs.getBoolean("available")) {
                System.out.println("Book is not available.");
                return;
            }

            String sql = "INSERT INTO issues (member_id, book_id, issue_date, due_date) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, memberId);
            ps.setInt(2, bookId);
            ps.setDate(3, Date.valueOf(issueDate));
            ps.setDate(4, Date.valueOf(dueDate));
            ps.executeUpdate();

            // Update book availability
            String updateSql = "UPDATE books SET available = FALSE WHERE book_id = ?";
            PreparedStatement updatePs = con.prepareStatement(updateSql);
            updatePs.setInt(1, bookId);
            updatePs.executeUpdate();

            System.out.println("Book issued.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
