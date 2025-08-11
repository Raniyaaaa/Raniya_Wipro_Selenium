//2.	Task Manager:
//o	Queue of tasks (String values).
//o	Add tasks, peek at the next task, and poll completed tasks.


package day_8_queue;

import java.util.LinkedList;
import java.util.Queue;

public class TaskManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> tasks = new LinkedList<>();
        tasks.add("Task1");
        tasks.add("Task2");
        tasks.add("Task3");

        System.out.println("Next Task: " + tasks.peek());
        tasks.poll();
        System.out.println("After Poll: " + tasks);
	}

}

//Next Task: Task1
//After Poll: [Task2, Task3]