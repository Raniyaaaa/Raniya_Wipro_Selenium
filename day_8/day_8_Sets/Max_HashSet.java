//3.	Write a method that takes a HashSet<Integer> and returns the maximum element.

package day_8_Sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Max_HashSet {
	
	public static int findMax(HashSet<Integer> set) {
		return Collections.max(set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<>(Arrays.asList(4, 7, 2, 9, 5));
        System.out.println("Max element: " + findMax(set));
	}

}

//Max element: 9