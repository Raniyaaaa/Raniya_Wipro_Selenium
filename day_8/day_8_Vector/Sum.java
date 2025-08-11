//•	Write a method that takes a Vector<Integer> and returns the sum of all elements.


package day_8_Vector;

import java.util.Vector;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> nums = new Vector<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        System.out.println("Vector: " + nums);
        System.out.println("Sum of elements: " +sum);
	}

}

//Vector: [10, 20, 30, 40]
//Sum of elements: 100