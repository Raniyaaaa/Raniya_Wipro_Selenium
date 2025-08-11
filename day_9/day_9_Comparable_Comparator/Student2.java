//Create a program where:
//Student implements Comparable to sort by name
//Use Comparator to sort by marks
//Demonstrate both sorting techniques in the same program.


package day_9_Comparable_Comparator;

import java.util.*;

public class Student2 implements Comparable<Student2> {
    String name;
    double marks;

    Student2(String name, double marks) {
        this.name = name; this.marks = marks;
    }

    public int compareTo(Student2 s) {
        return this.name.compareTo(s.name);
    }

    public String toString() {
        return name + " - " + marks;
    }

    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2("Zara", 90));
        list.add(new Student2("Asha", 95));
        list.add(new Student2("Kiran", 80));

        Collections.sort(list);
        System.out.println("Sorted by Name:");
        list.forEach(System.out::println);

        list.sort((a, b) -> Double.compare(b.marks, a.marks)); 
        System.out.println("\nSorted by Marks:");
        list.forEach(System.out::println);
    }
}

//Sorted by Name:
//Asha - 95.0
//Kiran - 80.0
//Zara - 90.0
//
//Sorted by Marks:
//Asha - 95.0
//Zara - 90.0
//Kiran - 80.0