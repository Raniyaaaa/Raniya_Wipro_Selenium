package day_8_Collections;

//Search an Element
//Write a program to:
//•	Create an ArrayList of integers.
//•	Ask the user to enter a number.
//•	Check if the number exists in the list.


import java.util.*;
public class Search_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int search = sc.nextInt();
		
		if(arr.contains(search)) {
			System.out.println("Number Exist!!");
		}else {
			System.out.println("Number not Exist!!");
		}
		
	}

}

//Enter a number : 
//5
//Number Exist!!
