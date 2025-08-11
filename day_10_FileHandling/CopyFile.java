//•	7. Write a program to copy content from one file to another using FileReader and FileWriter.
package day_10_FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("hello.txt");
        FileWriter fw = new FileWriter("copy.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
	}

}


