//•	2. Write a program to check whether a file exists at a given path.

package day_10_FileHandling;

import java.io.File;

public class FileExistCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("test.txt");
		if(f.exists()) {
			System.out.println("File Exist!!");
		}else {
            System.out.println("File does not exist.");
        }
	}

}

//File Exist!!
