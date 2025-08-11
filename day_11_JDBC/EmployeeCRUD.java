//7.	Design a Java application to perform all CRUD (Create, Read, Update, Delete) operations on an Employee table using JDBC.
package day_11_JDBC;

import java.sql.*;
import java.util.Scanner;

public class EmployeeCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/day_11";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            while (true) {
                System.out.println("\n--- Employee Management ---");
                System.out.println("1. Add Employee");
                System.out.println("2. View All Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> addEmployee(con, sc);
                    case 2 -> viewEmployees(con);
                    case 3 -> updateEmployee(con, sc);
                    case 4 -> deleteEmployee(con, sc);
                    case 5 -> {
                        System.out.println("Exiting program.");
                        sc.close();
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    static void addEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Name: ");
        sc.nextLine(); // consume leftover newline
        String name = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();

        String query = "INSERT INTO employee VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, dept);
            ps.setInt(4, salary);
            int rows = ps.executeUpdate();
            System.out.println(rows + " employee added.");
        }
    }

    static void viewEmployees(Connection con) throws SQLException {
        String query = "SELECT * FROM employee";
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            System.out.println("\nID\tName\t\tDepartment\tSalary");
            while (rs.next()) {
                System.out.printf("%d\t%-10s\t%-10s\t%d\n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getInt("salary"));
            }
        }
    }

    static void updateEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();
        System.out.print("Enter New Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Enter New Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter New Salary: ");
        int salary = sc.nextInt();

        String query = "UPDATE employee SET name = ?, department = ?, salary = ? WHERE id = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setInt(3, salary);
            ps.setInt(4, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " employee updated.");
        }
    }

    static void deleteEmployee(Connection con, Scanner sc) throws SQLException {
        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        String query = "DELETE FROM employee WHERE id = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            System.out.println(rows + " employee deleted.");
        }
    }
}

//
//--- Employee Management ---
//1. Add Employee
//2. View All Employees
//3. Update Employee
//4. Delete Employee
//5. Exit
//Enter your choice: 2
//
//ID	Name		Department	Salary
//1	Abik      	HR        	45000
//2	Bob       	Sales     	45000
//
//--- Employee Management ---
//1. Add Employee
//2. View All Employees
//3. Update Employee
//4. Delete Employee
//5. Exit
//Enter your choice: 1
//Enter ID: 3
//Enter Name: Raniya
//Enter Department: Developer
//Enter Salary: 45000
//1 employee added.
//
//--- Employee Management ---
//1. Add Employee
//2. View All Employees
//3. Update Employee
//4. Delete Employee
//5. Exit
//Enter your choice: 3
//Enter ID to update: 3
//Enter New Name: Rani
//Enter New Department: Developer
//Enter New Salary: 45000
//1 employee updated.
//
//--- Employee Management ---
//1. Add Employee
//2. View All Employees
//3. Update Employee
//4. Delete Employee
//5. Exit
//Enter your choice: 4
//Enter ID to delete: 1
//1 employee deleted.
//
//--- Employee Management ---
//1. Add Employee
//2. View All Employees
//3. Update Employee
//4. Delete Employee
//5. Exit
//Enter your choice: 5
//Exiting program.
//
