//•	9. Write a program to filter and display only .txt files from a folder using FilenameFilter.
package day_10_FileHandling;

import java.io.File;
import java.io.FilenameFilter;

public class FilterTextFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File(".");
        FilenameFilter filter = (d, name) -> name.endsWith(".txt");
        File[] files = dir.listFiles(filter);
        for (File f : files) {
            System.out.println(f.getName());
        }
	}

}

//report.txt
//reversed.txt
//source.txt
//story.txt
//student.txt
//test.txt
//updated_story.txt
//userinput.txt