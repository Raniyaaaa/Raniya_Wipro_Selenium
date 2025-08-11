//•	Create a Vector of Strings and:
//•	Add at least 4 names.
//•	Check if a specific name exists in the vector.
//•	Replace one name with another.
//•	Clear all elements from the vector.


package day_8_Vector;

import java.util.Vector;

public class Vector_strings {

    public static void main(String[] args) {

        Vector<String> names = new Vector<>();
        names.add("Rani");
        names.add("Geethu");
        names.add("Amal");
        names.add("Rohith");

        System.out.println("Original Vector: " + names);

        String nameToCheck = "Amal";
        if (names.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the vector.");
        } else {
            System.out.println(nameToCheck + " does not exist in the vector.");
        }

        names.set(1, "Nithya");
        System.out.println("After replacing index 1 with 'Nithya': " + names);

        names.clear();
        System.out.println("After clearing the vector: " + names);
    }
}

//Original Vector: [Rani, Geethu, Amal, Rohith]
//Amal exists in the vector.
//After replacing index 1 with 'Nithya': [Rani, Nithya, Amal, Rohith]
//After clearing the vector: []