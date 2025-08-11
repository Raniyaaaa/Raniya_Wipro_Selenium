//Create a File and Accept User Input
//Accept input from the user (using Scanner) and write the input to a file named userinput.txt.


package day_9_FileHandling;

import java.io.*;
import java.util.*;

public class UserInputToFile {

	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("userinput.txt");

        System.out.print("Enter text to store in file: ");
        String input = sc.nextLine();

        fw.write(input);
        fw.close();
        System.out.println("Input written to userinput.txt");
    }
}
