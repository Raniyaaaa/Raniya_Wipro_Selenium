package day_8_LinkedList;

//Remove Elements
//Write a program to:
//•	Create a LinkedList of animal names.
//•	Remove the first and last elements.
//•	Remove a specific element by value.
//•	Display the list after each removal.



import java.util.LinkedList;

public class Remove_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animals = new LinkedList<>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Dog");
		animals.add("Zebra");
		animals.add("Elephant");
		
		System.out.println("Original :"+animals);
		animals.removeFirst();
		System.out.println("After removing First :"+animals);
		animals.removeLast();
		System.out.println("After removing Last :"+animals);
		animals.remove("Dog");
		System.out.println("After removing Dog :"+animals);
		
		
	}

}

//Original :[Lion, Tiger, Dog, Zebra, Elephant]
//After removing First :[Tiger, Dog, Zebra, Elephant]
//After removing Last :[Tiger, Dog, Zebra]
//After removing Dog :[Tiger, Zebra]
