//1.	Palindrome Checker:
//o	Input a string and check if it is a palindrome using a Deque<Character>.


package day_8_queue;

import java.util.Deque;
import java.util.LinkedList;

public class Palindrome_deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
        Deque<Character> deque = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(str + " is " + (isPalindrome ? "a Palindrome" : "Not a Palindrome"));
	}

}

//madam is a Palindrome