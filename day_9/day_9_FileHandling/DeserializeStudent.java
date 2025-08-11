//Read Serialized Object from File
//Deserialize the student.ser file and display the object's content on the console.

package day_9_FileHandling;

import java.io.*;

public class DeserializeStudent {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
        Student s = (Student) in.readObject();
        in.close();

        System.out.println("Deserialized Student:");
        System.out.println(s);
    }
}

//Deserialized Student:
//ID: 101, Name: Rani, Marks: 89.5