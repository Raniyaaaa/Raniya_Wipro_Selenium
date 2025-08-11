//Copy Contents from One File to Another
//Write a program to read from source.txt and write the same content into destination.txt.


package day_9_FileHandling;

import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("source.txt"));
        writer.write("Haii\nIam Raniya");
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
        BufferedWriter destWriter = new BufferedWriter(new FileWriter("destination.txt"));

        String line;
        while ((line = reader.readLine()) != null) {
            destWriter.write(line);
            destWriter.newLine();
        }

        reader.close();
        destWriter.close();
        System.out.println("Content copied successfully");
    }
}


//Content copied successfully