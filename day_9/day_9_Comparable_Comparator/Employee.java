// Create an Employee class and sort by name using Comparable.
//Use the compareTo() method to sort alphabetically by employee names.


package day_9_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id; this.name = name;
    }

    public int compareTo(Employee e) {
        return this.name.compareTo(e.name);
    }

    public String toString() {
        return id + ": " + name;
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Zara"));
        list.add(new Employee(2, "Asha"));
        list.add(new Employee(3, "Kiran"));

        Collections.sort(list);

        System.out.println("Sorted by Name:");
        list.forEach(System.out::println);
    }
}

//Sorted by Name:
//2: Asha
//3: Kiran
//1: Zara