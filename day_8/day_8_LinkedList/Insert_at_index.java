package day_8_LinkedList;

//Insert Element at Specific Position
//Write a program to:
//•	Create a LinkedList of names.
//•	Insert a name at index 2.
//•	Display the list before and after insertion.


import java.util.LinkedList;

public class Insert_at_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<>();
		names.add("Rani");
		names.add("Geethu");
		System.out.println("Before" +names);
		
		names.add(2,"Amal");
		
		System.out.println("After "+names);

	}

}

//Before[Rani, Geethu]
//After [Rani, Geethu, Amal]