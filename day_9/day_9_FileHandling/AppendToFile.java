//Append Data to a File
//Write a Java program to append a new student name to the existing student.txt file without overwriting existing data.

package day_9_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("student.txt", true);
        writer.write("Hitha\n");
        writer.close();
        System.out.println("Student name appended.");
    }
}