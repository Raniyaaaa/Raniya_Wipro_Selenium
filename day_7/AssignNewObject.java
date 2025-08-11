package day_7;

//8.	Write a program where you assign a new object to a reference passed into a method. Show that the original reference does not change.

class Item {
    String name;
}

public class AssignNewObject {
    static void replace(Item i) {
        i = new Item();
        i.name = "New Item";
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.name = "Old Item";

        replace(i);
        System.out.println(i.name); 
    }
}

//Old Item
