//Write a menu-driven program to sort Employee objects by name, salary, or department using Comparator.

package day_9_Comparable_Comparator;

import java.util.*;

public class EmpMenu {
    String name, department;
    double salary;

    EmpMenu(String name, String dept, double salary) {
        this.name = name; this.department = dept; this.salary = salary;
    }

    public String toString() {
        return name + " - " + department + " - ₹" + salary;
    }

    public static void main(String[] args) {
        List<EmpMenu> list = Arrays.asList(
            new EmpMenu("Ravi", "HR", 30000),
            new EmpMenu("Asha", "IT", 50000),
            new EmpMenu("Kiran", "Admin", 40000)
        );

        Scanner sc = new Scanner(System.in);
        System.out.println("Sort by: 1.Name 2.Salary 3.Department");
        int choice = sc.nextInt();

        Comparator<EmpMenu> comp = null;
        switch (choice) {
            case 1: comp = Comparator.comparing(e -> e.name); break;
            case 2: comp = Comparator.comparingDouble(e -> e.salary); break;
            case 3: comp = Comparator.comparing(e -> e.department); break;
        }

        list.sort(comp);
        System.out.println("Sorted List:");
        list.forEach(System.out::println);
    }
}


//Sort by: 1.Name 2.Salary 3.Department
//3
//Sorted List:
//Kiran - Admin - ₹40000.0
//Ravi - HR - ₹30000.0
//Asha - IT - ₹50000.0