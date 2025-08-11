//3.	Write a program to:
//o	Merge two LinkedHashSets and print the result.

package day_8_Sets;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Merge_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> s1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3));
        LinkedHashSet<Integer> s2 = new LinkedHashSet<>(Arrays.asList(3, 4, 5));

        s1.addAll(s2);
        System.out.println("Merged Set: " + s1);
	}

}

//Merged Set: [1, 2, 3, 4, 5]