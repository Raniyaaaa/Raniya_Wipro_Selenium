//Sort a list of students by marks (descending) using Comparator.
//Create a Comparator class or use a lambda expression to sort by marks.


package day_9_Comparable_Comparator;

import java.util.ArrayList;
import java.util.List;

public class Students {
    String name;
    double marks;

    Students(String name, double marks) {
        this.name = name; this.marks = marks;
    }

    public String toString() {
        return name + " - " + marks;
    }

    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();
        list.add(new Students("Asha", 85));
        list.add(new Students("Kiran", 92));
        list.add(new Students("Ravi", 78));

        list.sort((a, b) -> Double.compare(b.marks, a.marks));

        System.out.println("Sorted by Marks (descending):");
        list.forEach(System.out::println);
    }
}

//Sorted by Marks (descending):
//Kiran - 92.0
//Asha - 85.0
//Ravi - 78.0