//•	15. Write a program to write data into a file using Files.write() and append using StandardOpenOption.APPEND.
package day_10_FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilesWriteAppend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("data.txt");
		String data="My name is :\tRaniya";
		Files.write(path, data.getBytes());
		String append = "\nAppended Line";
		Files.write(path, append.getBytes(), StandardOpenOption.APPEND);
		
	}
}

