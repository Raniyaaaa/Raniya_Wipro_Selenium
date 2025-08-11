package day_8_Collections;

//Sort Elements
//Write a program to:
//•	Create an ArrayList of integers.
//•	Add at least 7 random numbers.
//•	Sort the list in ascending order.
//•	Display the sorted list.


import java.util.ArrayList;
import java.util.Collections;

public class Sort_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(3);
		arr.add(8);
		arr.add(5);
		arr.add(10);
		arr.add(7);
		arr.add(2);
		arr.add(9);
		arr.add(12);
		
		Collections.sort(arr);
		System.out.println("Sorted list : "+arr);
		
		
	}

}

//Sorted list : [1, 2, 3, 5, 7, 8, 9, 10, 12]