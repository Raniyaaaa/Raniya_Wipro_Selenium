package Library_Management_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BookService {
	public static void addBook(Scanner sc) {
        try (Connection con = DBConnection.getConnection()) {
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Genre: ");
            String genre = sc.nextLine();

            String sql = "INSERT INTO books (title, author, genre) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, genre);
            ps.executeUpdate();

            System.out.println("✅ Book added.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static void viewBooks() {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "SELECT * FROM books";
            ResultSet rs = con.createStatement().executeQuery(sql);
            System.out.printf("%-5s %-25s %-20s %-15s %-10s\n", "ID", "Title", "Author", "Genre", "Available");
            while (rs.next()) {
                System.out.printf("%-5d %-25s %-20s %-15s %-10s\n",
                        rs.getInt("book_id"), rs.getString("title"),
                        rs.getString("author"), rs.getString("genre"),
                        rs.getBoolean("available") ? "Yes" : "No");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
