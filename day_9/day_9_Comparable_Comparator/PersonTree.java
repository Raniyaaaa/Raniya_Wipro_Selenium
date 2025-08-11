//Use TreeSet with a custom comparator to sort a list of persons by age.

package day_9_Comparable_Comparator;
import java.util.*;

public class PersonTree {
    String name;
    int age;

    PersonTree(String name, int age) {
        this.name = name; this.age = age;
    }

    public String toString() {
        return name + " - " + age;
    }

    public static void main(String[] args) {
        TreeSet<PersonTree> set = new TreeSet<>(Comparator.comparingInt(p -> p.age));

        set.add(new PersonTree("Ravi", 25));
        set.add(new PersonTree("Asha", 20));
        set.add(new PersonTree("Kiran", 30));

        System.out.println("TreeSet sorted by age:");
        set.forEach(System.out::println);
    }
}


//TreeSet sorted by age:
//Asha - 20
//Ravi - 25
//Kiran - 30