//Count Words and Lines
//Write a program to count the number of words and lines in a given text file notes.txt.


package day_9_FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsLines {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("student.txt"));
        String line;
        int lineCount = 0, wordCount = 0;
        while ((line = br.readLine()) != null) {
            lineCount++;
            wordCount += line.split("\\s+").length;
        }
        br.close();
        System.out.println("Lines: " + lineCount + ", Words: " + wordCount);
    }
}

//Lines: 6, Words: 6