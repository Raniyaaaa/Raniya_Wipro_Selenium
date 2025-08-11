//•	14. Write a program to read all lines of a file using Files.readAllLines() and print them.
package day_10_FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLines {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> lines = Files.readAllLines(Paths.get("hello.txt"));
        for (String line : lines) {
            System.out.println(line);
        }
	}

}

//Hello, World!
//Appended line.
//Appended line.