package day_8_Collections;

//Store Custom Objects
//Write a program to:
//•	Create a class Student with fields: id, name, and marks.
//•	Create an ArrayList of Student objects.
//•	Add at least 3 students.
//•	Display the details using a loop.


import java.util.ArrayList;

public class Student {

	int id;
	String name;
	double marks;
	
	Student(int id, String name, double marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> std = new ArrayList<>();
		
		std.add(new Student(1,"Rani", 97.4));
		std.add(new Student(2,"Ammu", 99.4));
		std.add(new Student(3,"Amal", 99));
		
		for(Student st : std) {
			System.out.print(st.id+" ");
			System.out.print(st.name+" ");
			System.out.println(st.marks);
		}
	}

}

//1 Rani 97.4
//2 Ammu 99.4
//3 Amal 99.0
