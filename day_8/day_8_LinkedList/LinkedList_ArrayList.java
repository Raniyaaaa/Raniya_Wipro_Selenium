//Convert LinkedList to ArrayList
//Write a program to:
//•	Create a LinkedList of Strings.
//•	Convert it into an ArrayList.
//•	Display both the LinkedList and ArrayList.

//
//Convert LinkedList to ArrayList
//Write a program to:
//•	Create a LinkedList of Strings.
//•	Convert it into an ArrayList.
//•	Display both the LinkedList and ArrayList.

package day_8_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Rectangle");
		ll.add("Circle");
		ll.add("Triangle");
		ll.add("square");
		
		System.out.println("Linked List   : "+ll);
		
		ArrayList<String> al = new ArrayList<>(ll);
		System.out.println("Array List   : "+al);
	}

}

//Linked List   : [Rectangle, Circle, Triangle, square]
//Array List   : [Rectangle, Circle, Triangle, square]