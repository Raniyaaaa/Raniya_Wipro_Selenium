//Write a program that sorts a list of cities by population using Comparator.

package day_9_Comparable_Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class City {
    String name;
    int population;

    City(String name, int population) {
        this.name = name; this.population = population;
    }

    public String toString() {
        return name + ": " + population;
    }

    public static void main(String[] args) {
        List<City> list = Arrays.asList(
            new City("Delhi", 19000000),
            new City("Mumbai", 21000000),
            new City("Chennai", 12000000)
        );

        list.sort(Comparator.comparingInt(c -> c.population));

        System.out.println("Sorted by Population:");
        list.forEach(System.out::println);
    }
}

//Sorted by Population:
//Chennai: 12000000
//Delhi: 19000000
//Mumbai: 21000000