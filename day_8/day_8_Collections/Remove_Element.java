package day_8_Collections;

//Remove Specific Element
//Write a program to:
//•	Create an ArrayList of Strings.
//•	Add 5 fruits.
//•	Remove a specific fruit by name.
//•	Display the updated list.


import java.util.*;

public class Remove_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Watermelon");
		fruits.add("Grapes");
		System.out.println("List before deletion :"+fruits);
		
		fruits.remove("Apple");
		System.out.println("List after deletion :"+fruits);
	}

}

//List before deletion :[Apple, Orange, Mango, Watermelon, Grapes]
//List after deletion :[Orange, Mango, Watermelon, Grapes]