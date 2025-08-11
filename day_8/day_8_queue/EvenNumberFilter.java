//3.	Write a method:
//o	That takes a queue of integers and returns a list of even numbers.

package day_8_queue;

import java.util.*;

public class EvenNumberFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 15, 20, 25, 30));
        List<Integer> evenNumbers = new ArrayList<>();

        for (int number : queue) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        System.out.println("Even Numbers: " + evenNumbers);
	}

}

//Even Numbers: [10, 20, 30]