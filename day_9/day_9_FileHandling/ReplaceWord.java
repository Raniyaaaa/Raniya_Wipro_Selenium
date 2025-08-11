//Replace a Word in a File
//Read content from story.txt, replace all occurrences of the word "Java" with "Python", and write the updated content to updated_story.txt

package day_9_FileHandling;

import java.io.*;

public class ReplaceWord {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("story.txt"));
        writer.write("Java is used in backend, mobile, and desktop.");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("story.txt"));
        BufferedWriter updatedWriter = new BufferedWriter(new FileWriter("updated_story.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            updatedWriter.write(line.replaceAll("Java", "Python"));
            updatedWriter.newLine();
        }

        reader.close();
        updatedWriter.close();
        System.out.println("Word replaced and written to updated_story.txt");
    }
}

//Word replaced and written to updated_story.txt