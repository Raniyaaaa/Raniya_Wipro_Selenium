//Word Search in a File
//Ask the user to enter a word and check whether it exists in the file notes.txt.

package day_9_FileHandling;

import java.io.*;
import java.util.*;

public class SearchWord {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("notes.txt"));
        writer.write("Java is a popular programming language.\n helloo.");
        writer.close();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
        String line;
        boolean found = false;

        while ((line = reader.readLine()) != null) {
            if (line.contains(word)) {
                found = true;
                break;
            }
        }
        reader.close();

        if (found)
            System.out.println("Word found in file");
        else
            System.out.println("Word not found");
    }
}

//Enter word to search: language
//Word found in file