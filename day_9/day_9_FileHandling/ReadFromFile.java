//Write a program to read the contents of student.txt and display them line by line using BufferedReader.
package day_9_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}

//Riya
//Nima
//Rasheed
//Raniya
//Dua