package day_8_LinkedList;

//Create and Display a LinkedList
//Write a program to:
//•	Create a LinkedList of Strings.
//•	Add five colors to it.
//•	Display the list using a for-each loop.


import java.util.LinkedList;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> clrs = new LinkedList<>();
		clrs.add("White");
		clrs.add("Pink");
		clrs.add("Red");
		clrs.add("Black");
		clrs.add("Green");
		
		for(String c: clrs) {
			System.out.println(c);
		}
	}

}

//White
//Pink
//Red
//Black
//Green
