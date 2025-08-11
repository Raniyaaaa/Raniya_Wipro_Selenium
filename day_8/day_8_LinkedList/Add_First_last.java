package day_8_LinkedList;
//Add Elements at First and Last Position
//Write a program to:
//•	Create a LinkedList of integers.
//•	Add elements at the beginning and at the end.
//•	Display the updated list.


import java.util.LinkedList;

public class Add_First_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> shape = new LinkedList<>();
		shape.add("Circle");
		shape.add("Rectangle");
		
		shape.addFirst("Square");
		shape.addLast("Triangle");
		
		System.out.println(shape);
	}

}

//[Square, Circle, Rectangle, Triangle]