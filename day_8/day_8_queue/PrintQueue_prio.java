//2.	Print Jobs Priority:
//o	Add different print jobs (String) with priority levels.
//o	Use PriorityQueue to simulate serving high-priority jobs before others.

package day_8_queue;

import java.util.*;

class PrintJob {
    String jobName;
    int priority;

    public PrintJob(String jobName, int priority) {
        this.jobName = jobName;
        this.priority = priority;
    }

    public String toString() {
        return jobName + " (Priority: " + priority + ")";
    }
}

public class PrintQueue_prio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<PrintJob> queue = new PriorityQueue<>(
	            (a, b) -> b.priority - a.priority
	        );

	        queue.add(new PrintJob("Doc1", 3));
	        queue.add(new PrintJob("Doc2", 5));
	        queue.add(new PrintJob("Doc3", 1));

	        while (!queue.isEmpty()) {
	            System.out.println("Printing: " + queue.poll());
	        }
	}

}

//Printing: Doc2 (Priority: 5)
//Printing: Doc1 (Priority: 3)
//Printing: Doc3 (Priority: 1)

