//Create multiple sorting strategies for a Product class.
//Implement comparators to sort by:
//Price ascending
//Price descending
//Name alphabetically

package day_9_Comparable_Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Product2 {
    String name;
    double price;

    Product2(String name, double price) {
        this.name = name; this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }

    public static void main(String[] args) {
        List<Product2> list = Arrays.asList(
            new Product2("Phone", 20000),
            new Product2("Tablet", 15000),
            new Product2("Laptop", 50000)
        );

        System.out.println("Price Ascending:");
        list.stream().sorted(Comparator.comparingDouble(p -> p.price)).forEach(System.out::println);

        System.out.println("\nPrice Descending:");
        list.stream().sorted((a, b) -> Double.compare(b.price, a.price)).forEach(System.out::println);

        System.out.println("\nName Alphabetically:");
        list.stream().sorted(Comparator.comparing(p -> p.name)).forEach(System.out::println);
    }
}


//Price Ascending:
//Tablet - ₹15000.0
//Phone - ₹20000.0
//Laptop - ₹50000.0
//
//Price Descending:
//Laptop - ₹50000.0
//Phone - ₹20000.0
//Tablet - ₹15000.0
//
//Name Alphabetically:
//Laptop - ₹50000.0
//Phone - ₹20000.0
//Tablet - ₹15000.0