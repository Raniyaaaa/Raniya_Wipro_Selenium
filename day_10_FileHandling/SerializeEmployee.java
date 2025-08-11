package day_10_FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//•	19. Write a program to serialize a class Employee and store it in employee.ser.
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializeEmployee {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1001, "Raniya");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        oos.writeObject(emp);
        oos.close();
	}

}
