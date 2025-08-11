//3.	Create a TreeSet with a custom comparator:
//o	Sort strings in reverse alphabetical order using Comparator.

package day_8_Sets;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustomComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> cities = new TreeSet<>(Comparator.reverseOrder());
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Kolkata");

        System.out.println("Cities in Reverse Order: " + cities);
	}

}

//Cities in Reverse Order: [Mumbai, Kolkata, Delhi, Chennai]