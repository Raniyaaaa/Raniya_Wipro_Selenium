//Check if a File Exists and Display Properties
//Create a program to check if report.txt exists. If it does, display its:
//•	Absolute path
//•	File name
//•	Writable (true/false)
//•	Readable (true/false)
//•	File size in bytes

package day_9_FileHandling;

import java.io.*;

public class FileProperties {
    public static void main(String[] args) {
        try {
            File file = new File("report.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Contend to write in the fileee");
            writer.close();

            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("File Name: " + file.getName());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size : " + file.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//Absolute Path: C:\Users\raniy\eclipse-workspace\Assignment\report.txt
//File Name: report.txt
//Writable: true
//Readable: true
//File Size : 30
