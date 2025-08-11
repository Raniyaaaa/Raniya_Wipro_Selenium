//Clone a LinkedList
//Write a program to:
//•	Create a LinkedList of numbers.
//•	Clone it using the clone() method.
//•	Display both original and cloned lists.


package day_8_LinkedList;

import java.util.LinkedList;

public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(3);
		ll.add(4);
		ll.add(6);
		
		System.out.println("Original  : "+ll);
		
		System.out.println("Clone     : "+ll.clone());
	}

}

//Original  : [1, 3, 4, 6]
//Clone     : [1, 3, 4, 6]