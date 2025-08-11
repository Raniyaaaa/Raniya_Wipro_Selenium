package day_8_Collections;

//Remove All Elements
//Write a program to:
//•	Create an ArrayList of integers.
//•	Add multiple elements.
//•	Remove all elements using clear() method.
//•	Display the size of the list.


import java.util.ArrayList;

public class Remove_all {

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
		
		arr.clear();
		System.out.println("Size : "+arr.size());
	}

}

//Size : 0