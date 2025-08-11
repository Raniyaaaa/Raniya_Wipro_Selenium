//Create a Product class and sort products by price using Comparable.
//Implement Comparable<Product> and sort a list of products using Collections.sort().

package day_9_Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id; this.name = name; this.price = price;
    }

    public int compareTo(Product p) {
        return Double.compare(this.price, p.price);
    }

    public String toString() {
        return name + " - Rs." + price;
    }
}
public class Products_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Phone", 25000));
        list.add(new Product(2, "Laptop", 60000));
        list.add(new Product(3, "Tablet", 15000));

        Collections.sort(list);

        System.out.println("Sorted by Price (ascending):");
        list.forEach(System.out::println);
		
	}

}

//Sorted by Price (ascending):
//Tablet - Rs.15000.0
//Phone - Rs.25000.0
//Laptop - Rs.60000.0