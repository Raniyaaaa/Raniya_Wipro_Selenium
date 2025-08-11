//•	5. Write a program to append a line of text to an existing file.
package day_10_FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter writer = new FileWriter("hello.txt", true);
        writer.write("\nAppended line.");
        writer.close();
	}

}
