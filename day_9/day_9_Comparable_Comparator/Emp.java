//Implement a program that sorts a list of custom objects using Comparable, and displays them before and after sorting.

package day_9_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Emp implements Comparable<Emp> {
    int id;
    String name;

    Emp(int id, String name) {
        this.id = id; this.name = name;
    }

    public int compareTo(Emp e) {
        return this.name.compareTo(e.name);
    }

    public String toString() {
        return id + ": " + name;
    }

    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(3, "Rani"));
        list.add(new Emp(1, "Bibin"));
        list.add(new Emp(2, "Anil"));

        System.out.println("Before Sorting:");
        list.forEach(System.out::println);

        Collections.sort(list);

        System.out.println("\nAfter Sorting:");
        list.forEach(System.out::println);
    }
}

//Before Sorting:
//3: Rani
//1: Bibin
//2: Anil
//
//After Sorting:
//2: Anil
//1: Bibin
//3: Rani
