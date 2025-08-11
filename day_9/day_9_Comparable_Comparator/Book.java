//Sort a list of Book objects by bookId in descending order using Comparable.
//Hint: Override compareTo() to return the reverse order


package day_9_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
    int bookId;
    String title;

    Book(int bookId, String title) {
        this.bookId = bookId; this.title = title;
    }

    public int compareTo(Book b) {
        return Integer.compare(b.bookId, this.bookId);
    }

    public String toString() {
        return bookId + ": " + title;
    }

    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add(new Book(101, "Java"));
        list.add(new Book(105, "Python"));
        list.add(new Book(103, "C++"));

        Collections.sort(list);
        list.forEach(System.out::println);
    }
}

//105: Python
//103: C++
//101: Java