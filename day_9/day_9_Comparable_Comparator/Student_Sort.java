//Sort a list of students by roll number (ascending) using Comparable.
//Create a Student class with fields: rollNo, name, and marks. Implement the Comparable interface to sort students by their roll numbers.

package day_9_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int rollNo;
	String name;
	double marks;
	
	Student(int rollNo, String name, double marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	public int compareTo(Student s) {
		return this.rollNo-s.rollNo;
	}
	
	public String toString() {
		return this.rollNo+" "+this.name+" "+this.marks;
	}
}
public class Student_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
        students.add(new Student(103, "Rani", 78.5));
        students.add(new Student(101, "Ammu", 85.0));
        students.add(new Student(102, "Riya", 90.2));

        Collections.sort(students);

        System.out.println("Sorted Students by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }
	}

}

//Sorted Students by Roll Number:
//101 Ammu 85.0
//102 Riya 90.2
//103 Rani 78.5
