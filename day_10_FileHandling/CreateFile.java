//•	1. Write a program to create a new text file named test.txt.
package day_10_FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("test.txt");
		f.createNewFile();
		System.out.println("File created!!");
	}

}

//File created!!
