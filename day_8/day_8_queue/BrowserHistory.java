//3.	Browser History Simulation:
//o	Implement browser back and forward navigation using two deques.

package day_8_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> backStack = new ArrayDeque<>();
        Deque<String> forwardStack = new ArrayDeque<>();

        backStack.push("Google");
        backStack.push("YouTube");
        backStack.push("GitHub");

        System.out.println("Current Page: " + backStack.peek());

        forwardStack.push(backStack.pop());
        System.out.println("After Back: " + backStack.peek());

        backStack.push(forwardStack.pop());
        System.out.println("After Forward: " + backStack.peek());
	}

}

//Current Page: GitHub
//After Back: YouTube
//After Forward: GitHub
