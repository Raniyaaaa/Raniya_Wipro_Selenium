//•	20. Write a program to deserialize the employee.ser file and display the object data.
package day_10_FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee emp = (Employee) ois.readObject();
        System.out.println("ID: " + emp.id + ", Name: " + emp.name);
        ois.close();
	}

}

//ID: 1001, Name: Raniya