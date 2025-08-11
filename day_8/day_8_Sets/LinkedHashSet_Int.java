//Create a LinkedHashSet of Integers:
//o	Add numbers: 10, 5, 20, 15, 5.
//o	Print the elements and observe the order.


package day_8_Sets;

import java.util.LinkedHashSet;

public class LinkedHashSet_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		lhs.add(10);
		lhs.add(5);
		lhs.add(20);
		lhs.add(15);
		lhs.add(5);
		
		System.out.println("Order preserved: " +lhs);

	}

}

//Order preserved: [10, 5, 20, 15]