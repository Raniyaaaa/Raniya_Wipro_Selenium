//Store Objects in a File using Serialization
//Create a Student class with id, name, and marks. Serialize one object and save it in a file named student.ser.

package day_9_FileHandling;

import java.io.*;

class Student implements Serializable {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class SerializeStudent {

	public static void main(String[] args) throws IOException {
        Student s = new Student(101, "Rani", 89.5);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
        out.writeObject(s);
        out.close();

        System.out.println("Student object serialized to student.ser");
    }
}


//Student object serialized to student.ser