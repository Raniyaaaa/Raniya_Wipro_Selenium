//•	11. Write a program to read a file using Scanner and display the tokens.
package day_10_FileHandling;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadWithScanner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new File("hello.txt"));
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
	}

}

//Hello,
//World!
//Appended
//line.
