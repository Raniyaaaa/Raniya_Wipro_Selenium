//Reverse File Content
//Write a program to read a file data.txt and create another file reversed.txt containing the lines in reverse order.


package day_9_FileHandling;

import java.io.*;
import java.util.*;

public class ReverseFileContent {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
        writer.write("First line\nSecond line\nThird line");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        List<String> lines = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        Collections.reverse(lines);
        BufferedWriter reversedWriter = new BufferedWriter(new FileWriter("reversed.txt"));
        for (String l:lines) {
            reversedWriter.write(l);
            reversedWriter.newLine();
        }
        reversedWriter.close();

        System.out.println("Reversed content written to reversed.txt");
    }
}

//Reversed content written to reversed.txt