//Create procedure or functions for employee table 
//1.	Add 5000 bonus to all employee
//2.	Print same name employees
//3.	Print highest and lowest salary from employee table


package day_12;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "root";
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            
            CallableStatement cstBonus = con.prepareCall("{call addBonus()}");
            cstBonus.executeUpdate();
            CallableStatement cstShow = con.prepareCall("SELECT * FROM employee");
            ResultSet rsbonus = cstShow.executeQuery();
            System.out.println("Bonus of 5000 added to all employeess...");
            System.out.println("ID\tName\t\tSalary");
            while (rsbonus.next()) {
            	int id = rsbonus.getInt("id");
                String name = rsbonus.getString("name");
                int salary = rsbonus.getInt("salary");
                System.out.println(id +"\t"+ name +"\t\t"+ salary);
            }
     
            CallableStatement cstDup = con.prepareCall("{call printDuplicateNames()}");
            ResultSet rsDup = cstDup.executeQuery();
            System.out.println("\nEmployees with Same Names:");
            System.out.println("ID\tName\t\tSalary");
            while (rsDup.next()) {
            	int id = rsDup.getInt("id");
                String name = rsDup.getString("name");
                int salary = rsDup.getInt("salary");
                System.out.println(id +"\t"+ name+"\t\t"+ salary);
            }
            
            CallableStatement cstMinMax = con.prepareCall("{call get_MaxMinSalary()}");
            ResultSet rsSal = cstMinMax.executeQuery();
            if (rsSal.next()) {
                int max = rsSal.getInt("Max_Salary");
                int min = rsSal.getInt("Min_Salary");
                System.out.println("\nHighest Salary: " + max);
                System.out.println("Lowest Salary:  " + min);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

}

//Bonus of 5000 added to all employeess...
//ID	Name		Salary
//1	Raniya		35000
//2	Dua		45000
//3	Raniya		55000
//4	Nima		35000
//5	Dua		50000
//
//Employees with Same Names:
//ID	Name		Salary
//1	Raniya		35000
//2	Dua		45000
//3	Raniya		55000
//5	Dua		50000
//
//Highest Salary: 55000
//Lowest Salary:  35000
