package day_8_queue;

//3.	Write a method:
//o	To merge two PriorityQueue<Integer> and return a sorted merged queue.

		
import java.util.PriorityQueue;

public class Merge_prio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(5);
        pq1.add(15);
        pq1.add(25);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(10);
        pq2.add(20);
        pq2.add(30);

        PriorityQueue<Integer> mergedQueue = new PriorityQueue<>(pq1);
        mergedQueue.addAll(pq2);

        System.out.println("Merged Sorted Queue:");
        while (!mergedQueue.isEmpty()) {
            System.out.print(mergedQueue.poll() + " ");
        }
    }
}

//Merged Sorted Queue:
//5 10 15 20 25 30 