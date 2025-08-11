//1.	Bank Queue Simulation:
//o	Create a queue of customer names using Queue<String>.
//o	Add 5 customers to the queue.
//o	Serve (remove) customers one by one and print the queue after each removal.

package day_8_queue;

import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> customers = new LinkedList<>();
        customers.add("Riyaa");
        customers.add("Manu");
        customers.add("Raniya");
        customers.add("Ziya");
        customers.add("Dua");

        while (!customers.isEmpty()) {
            System.out.println("Serving: " + customers.poll());
            System.out.println("Remaining Queue: " + customers);
        }
	}

}

//Serving: Manu
//Remaining Queue: [Raniya, Ziya, Dua]
//Serving: Raniya
//Remaining Queue: [Ziya, Dua]
//Serving: Ziya
//Remaining Queue: [Dua]
//Serving: Dua
//Remaining Queue: []
