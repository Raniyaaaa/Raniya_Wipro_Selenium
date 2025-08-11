package day_8_Collections;

//Iterate using Iterator
//Write a program to:
//•	Create an ArrayList of cities.
//•	Use Iterator to display each city.


import java.util.ArrayList;
import java.util.Iterator;

public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Kochi");
		cities.add("Trivandrum");
		cities.add("Malappuram");
		cities .add("Bangalore");
		
		Iterator<String> itr = cities.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}

}

//Kochi Trivandrum Malappuram Bangalore 
