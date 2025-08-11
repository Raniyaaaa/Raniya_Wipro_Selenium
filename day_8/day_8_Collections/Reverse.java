package day_8_Collections;

//Reverse the ArrayList
//Write a program to:
//•	Create an ArrayList of characters.
//•	Add 5 characters.
//•	Reverse the list using Collections.reverse() and display it.


import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> ch = new ArrayList<>();
		ch.add('A');
		ch.add('B');
		ch.add('C');
		ch.add('D');
		ch.add('E');
		
		Collections.reverse(ch);
		System.out.println("Reversed list : "+ch);
	}

}

//Reversed list : [E, D, C, B, A]