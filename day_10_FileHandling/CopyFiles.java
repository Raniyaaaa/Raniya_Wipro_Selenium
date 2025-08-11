//•	17. Write a program to copy a file using Files.copy() with REPLACE_EXISTING option.
package day_10_FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path src = Paths.get("hello.txt");
        Path dest = Paths.get("copied.txt");
        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
	}

}
