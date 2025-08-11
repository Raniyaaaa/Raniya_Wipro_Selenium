//2.	Create a TreeSet of Integers:
//o	Add some numbers and print the first and last elements.
//o	Find the elements lower than and higher than a given number using lower() and higher() methods

package day_8_Sets;

import java.util.TreeSet;

public class TreeSetNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(70);
        numbers.add(20);

        System.out.println("Numbers: " + numbers);
        System.out.println("First: " + numbers.first());
        System.out.println("Last: " + numbers.last());
        System.out.println("Lower than 30: " + numbers.lower(30));
        System.out.println("Higher than 30: " + numbers.higher(30));
	}

}

//Numbers: [10, 20, 30, 50, 70]
//First: 10
//Last: 70
//Lower than 30: 20
//Higher than 30: 50