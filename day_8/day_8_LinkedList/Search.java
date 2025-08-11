package day_8_LinkedList;

//Search for an Element
//Write a program to:
//•	Create a LinkedList of Strings.
//•	Ask the user for a string to search.
//•	Display if the string is found or not.

import java.util.LinkedList;
import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<>();

        arr.add("Apple");
        arr.add("Banana");
        arr.add("Mango");
        arr.add("Orange");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to search: ");
        String search = sc.next(); 

        if (arr.contains(search)) {
            System.out.println("String exists in the list!");
        } else {
            System.out.println("String does NOT exist in the list.");
        }

    }
}


//Enter a string to search: Banana
//String exists in the list!
