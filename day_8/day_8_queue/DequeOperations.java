//2.	Double-ended Order System:
//o	Add items from front and rear.
//o	Remove items from both ends.
//o	Display contents of the deque after each operation.

package day_8_queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> orders = new LinkedList<>();

        orders.addFirst("Order1");
        orders.addLast("Order2");
        System.out.println("After adding: " + orders);

        orders.removeFirst();
        System.out.println("After removing front: " + orders);

        orders.addFirst("Order3");
        orders.removeLast();
        System.out.println("After removing rear: " + orders);
	}

}

//After adding: [Order1, Order2]
//After removing front: [Order2]
//After removing rear: [Order3]