//•	Convert a decimal number to binary using Stack.

package day_8_stack;

import java.util.Stack;

public class Decimal_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
        Stack<Integer> stack = new Stack<>();

        while (num > 0) {
            stack.push(num % 2);
            num /= 2;
        }

        System.out.print("Binary: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
	}

}

//Binary: 1101