//1.	Create a HashSet of Strings:
//o	Add 5 different city names.
//o	Try adding a duplicate city and observe the output.
//o	Iterate using an Iterator and print each city.


//2.	Perform operations:
//o	Remove an element.
//o	Check if a city exists.
//o	Clear the entire HashSet.

package day_8_Sets;

import java.util.HashSet;
import java.util.Iterator;

public class String_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> cities = new HashSet<>();
        cities.add("Kochi");
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add("Kochi");
        
        System.out.print("Cities:");
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        cities.remove("Delhi");

        System.out.println("\nContains Mumbai? " + cities.contains("Mumbai"));
        
        cities.clear();
        System.out.println("Is empty? " + cities.isEmpty());
	}

}

//Cities:Delhi Kochi Chennai Mumbai Bangalore 
//Contains Mumbai? true
//Is empty? true
