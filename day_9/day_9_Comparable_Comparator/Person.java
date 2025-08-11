//Use Comparator.comparing() with method references to sort objects in Java 8+.

package day_9_Comparable_Comparator;
import java.util.*;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name; this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public String toString() {
        return name + " - " + age;
    }

    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
            new Person("Ravi", 25),
            new Person("Kiran", 30),
            new Person("Asha", 20)
        );

        list.sort(Comparator.comparing(Person::getName));
        System.out.println("Sorted by Name:");
        list.forEach(System.out::println);

        list.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("\nSorted by Age:");
        list.forEach(System.out::println);
    }
}

//Sorted by Name:
//Asha - 20
//Kiran - 30
//Ravi - 25
//
//Sorted by Age:
//Asha - 20
//Ravi - 25
//Kiran - 30