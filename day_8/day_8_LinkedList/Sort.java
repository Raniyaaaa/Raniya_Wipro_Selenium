//Sort a LinkedList
//Write a program to:
//•	Create a LinkedList of integers.
//•	Add unsorted numbers.
//•	Sort the list using Collections.sort().
//•	Display the sorted list.


package day_8_LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(3);
		ll.add(8);
		ll.add(5);
		ll.add(10);
		ll.add(7);
		ll.add(2);
		ll.add(9);
		ll.add(12);
		
		Collections.sort(ll);
		System.out.println("Sorted list : "+ll);
	}

}


//Sorted list : [1, 2, 3, 5, 7, 8, 9, 10, 12]