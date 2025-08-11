//•	Reverse a string using Stack:
//•	Input a string from the user.
//•	Use a stack to reverse and print the string.

package day_8_stack;

import java.util.Scanner;
import java.util.Stack;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Reversed: " + reversed.toString());
	}

}

//Enter string: Raniya
//Reversed: ayinaR