//Sort a list of Book objects using both Comparable (by ID) and Comparator (by title, then author).

package day_9_Comparable_Comparator;

import java.util.*;

public class Book2 implements Comparable<Book2> {
    int id;
    String title, author;

    Book2(int id, String title, String author) {
        this.id = id; this.title = title; this.author = author;
    }

    public int compareTo(Book2 b) {
        return Integer.compare(this.id, b.id);
    }

    public String toString() {
        return id + ": " + title + " by " + author;
    }

    public static void main(String[] args) {
        List<Book2> list = Arrays.asList(
            new Book2(101, "Java", "ABC"),
            new Book2(103, "Python", "DEF"),
            new Book2(102, "C++", "HIJ")
        );

        Collections.sort(list);
        System.out.println("Sorted by ID:");
        list.forEach(System.out::println);

        list.sort(Comparator.comparing((Book2 b) -> b.title).thenComparing(b -> b.author));
        System.out.println("\nSorted by Title, then Author:");
        list.forEach(System.out::println);
    }
}

//101: Java by ABC
//102: C++ by HIJ
//103: Python by DEF
//
//Sorted by Title, then Author:
//102: C++ by HIJ
//101: Java by ABC
//103: Python by DEF