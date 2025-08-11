//Delete a File
//Write a program to delete a file (given by file name) if it exists.


package day_9_FileHandling;

import java.io.*;
import java.util.*;

public class DeleteFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to delete: ");
        String filename = sc.nextLine();

        File file = new File(filename);
        file.createNewFile();
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("File deletion failed");
        }
    }
}

//Enter file name to delete: report.txt
//File deleted successfully