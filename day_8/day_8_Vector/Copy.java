//•	Write a program to:
//•	Copy all elements from one Vector to another Vector.
//•	Compare both vectors for equality.


package day_8_Vector;

import java.util.Vector;

public class Copy {

	public static void main(String[] args) {
		
		Vector<Character> v1 = new Vector<>();
		v1.add('A');
		v1.add('B');
		v1.add('C');
		
		Vector<Character> v2 = new Vector<>(v1);
		
		System.out.println("Vector 1: " + v1);
        System.out.println("Vector 2: " + v2);

        if (v1.equals(v2)) {
            System.out.println("Vectors are equal.");
        } else {
            System.out.println("Vectors are NOT equal.");
        }
	}
}

//Vector 1: [A, B, C]
//Vector 2: [A, B, C]
//Vectors are equal.