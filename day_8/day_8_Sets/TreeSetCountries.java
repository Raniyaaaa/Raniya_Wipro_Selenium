//Create a TreeSet of Strings:
//o	Add 5 country names in random order.
//o	Print the sorted list of countries using TreeSet.


package day_8_Sets;

import java.util.TreeSet;

public class TreeSetCountries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> countries = new TreeSet<>();
        countries.add("India");
        countries.add("Brazil");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Australia");

        System.out.println("Sorted Countries: " + countries);
	}

}

//Sorted Countries: [Australia, Brazil, Germany, India, USA]