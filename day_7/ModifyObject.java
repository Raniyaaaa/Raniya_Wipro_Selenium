package day_7;

//5.	Write a Java program to pass an object to a method and modify its internal fields. Verify that the changes reflect outside the method.

class Person {
    String name;
}

public class ModifyObject {
    static void rename(Person p, String newName) {
        p.name = newName;
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Raniya";

        System.out.println("Before: " + p.name);
        rename(p, "Rasheed");
        System.out.println("After: " + p.name);
    }
}


//Before: Raniya
//After: Rasheed
