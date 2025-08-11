//•	Use Stack to check for balanced parentheses in an expression.
//•	Input: (a+b) * (c-d)
//•	Output: Valid or Invalid expression


package day_8_stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expr = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (char ch : expr.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            isValid = false;
        }

        System.out.println("Expression is " + (isValid ? "Valid" : "Invalid"));
	}

}

//Enter an expression: (a+b) * (c-d)
//Expression is Valid