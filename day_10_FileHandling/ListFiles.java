//•	8. Write a program that lists all the files in a directory.
package day_10_FileHandling;

import java.io.File;

public class ListFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File(".");
        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }
	}

}

//src
//story.txt
//student.ser
//student.txt
//Student_Report.csv
//test.txt
//updated_story.txt
//userinput.txt