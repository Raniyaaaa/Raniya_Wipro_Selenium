package day_8_Collections;

//Copy One ArrayList to Another
//Write a program to:
//•	Create an ArrayList with some elements.
//•	Create a second ArrayList.
//•	Copy all elements from the first to the second using addAll() method.



import java.util.ArrayList;

public class Copy_ArrayList_toAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> ch = new ArrayList<>();
		ch.add('A');
		ch.add('B');
		ch.add('C');
		ch.add('D');
		ch.add('E');
		
		ArrayList<Character> ch2 = new ArrayList<>();
		ch2.addAll(ch);
		System.out.println(ch2);

	}

}

//[A, B, C, D, E]