//Iterate using ListIterator
//Write a program to:
//•	Create a LinkedList of cities.
//•	Use ListIterator to display the list in both forward and reverse directions.


package day_8_LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;


public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cities = new LinkedList<>();
		cities.add("Kochi");
		cities.add("Trivandrum");
		cities.add("Malappuram");
		cities .add("Bangalore");
		
		System.out.println("Forward traversal:");
        ListIterator<String> itr = cities.listIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println("\n\nReverse traversal:");
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
	}

}

//Forward traversal:
//Kochi Trivandrum Malappuram Bangalore 
//
//Reverse traversal:
//Bangalore Malappuram Trivandrum Kochi 