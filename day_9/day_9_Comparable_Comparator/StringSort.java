//Use an anonymous inner class to sort a list of strings by length.

package day_9_Comparable_Comparator;

import java.util.*;

public class StringSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "grape");

        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        });

        System.out.println("Sorted by Length:");
        list.forEach(System.out::println);
    }
}

//Sorted by Length:
//kiwi
//apple
//grape
//banana