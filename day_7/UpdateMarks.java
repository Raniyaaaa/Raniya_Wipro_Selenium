package day_7;

//6.	Create a class Student with name and marks. Write a method to update the marks of a student. Demonstrate the changes in the original object.

class Student {
    String name;
    int marks;
}

public class UpdateMarks {
    static void updateMarks(Student s, int newMarks) {
        s.marks = newMarks;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Rani";
        st.marks = 70;

        System.out.println("Before: " + st.marks);
        updateMarks(st, 95);
        System.out.println("After: " + st.marks);
    }
}

//Before: 70
//After: 95
