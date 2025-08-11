//•	6. Write a program to count the number of lines, words, and characters in a file.
package day_10_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Counts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader("hello.txt"));
        int lines = 0, words = 0, chars = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            lines++;
            words += line.split("\\s+").length;
            chars += line.length();
        }
        reader.close();
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
	}

}


//Lines: 3
//Words: 6
//Characters: 41