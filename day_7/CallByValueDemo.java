package day_7;

//7.	Create a program to show that Java is strictly "call by value" even when passing objects (object references are passed by value).


class Boxs {
    int length;
}

public class CallByValueDemo {
    static void changeObject(Boxs b) {
        b = new Boxs();
        b.length = 50;
    }

    public static void main(String[] args) {
        Boxs box = new Boxs();
        box.length = 10;

        changeObject(box);
        System.out.println("After method: " + box.length); 
    }
}


//After method: 10