//•	Create a Vector of integers and perform the following operations:
//•	Add 5 integers to the Vector.
//•	Insert an element at the 3rd position.
//•	Remove the 2nd element.
//•	Display the elements using Enumeration.


package day_8_Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(4);
		v.add(6);
		v.add(8);
		
		System.out.println("Original :"+v);
		
		v.add(2, 7);
		v.remove(1);
		
		Enumeration<Integer> en = v.elements();
        System.out.print("Vector Elements: ");
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
		
	}

}

//Original :[1, 2, 4, 6, 8]
//Vector Elements: 1 7 4 6 8 
