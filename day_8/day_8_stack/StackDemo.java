//•	Create a Stack of integers and:
//•	Push 5 elements.
//•	Pop the top element.
//•	Peek the current top.
//•	Check if the stack is empty.


package day_8_stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Stack: " + stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Is Empty: " + stack.isEmpty());
	}

}

//Stack: [10, 20, 30, 40, 50]
//Popped: 50
//Peek: 40
//Is Empty: false
