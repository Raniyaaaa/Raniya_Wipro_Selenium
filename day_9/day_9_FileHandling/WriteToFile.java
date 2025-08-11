//Write a Java program to create a file named student.txt and write 5 lines of student names using FileWriter.
package day_9_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("student.txt");
        writer.write("Riya\nNima\nRasheed\nRaniya\nDua\n");
        writer.close();
        System.out.println("student.txt created and written");
	}

}

//student.txt created and written