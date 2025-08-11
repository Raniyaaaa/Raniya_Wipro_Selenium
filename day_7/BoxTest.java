package day_7;


//4.	Create a class Box with a variable length. Write a method that modifies the value of length by passing the Box object. Show that the original object is modified.

class Box {
    int length;
}

public class BoxTest {
    static void changeLength(Box b, int newLength) {
        b.length = newLength;
    }

    public static void main(String[] args) {
        Box box = new Box();
        box.length = 10;
        System.out.println("Before: " + box.length);

        changeLength(box, 20);

        System.out.println("After: " + box.length);
    }
}

//Before: 10
//After: 20

