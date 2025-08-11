package day_8_Collections;

//Update an Element
//Write a program to:
//•	Create an ArrayList of subjects.
//•	Replace one of the subjects (e.g., “Math” to “Statistics”).
//•	Print the list before and after the update.

import java.util.*;

public class Update_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> subject = 
				new ArrayList<>(List.of("English","Math", "Science", "Social", "Malayalam"));
		
		System.out.println("Before Update :"+subject);
		
		int index = subject.indexOf("Math");
		subject.set(index, "Statistics");
		System.out.println("After Update :"+subject);
		
	}

}
