package day_7;

// Write a program to create two threads, each printing a different message 5 times.

public class TwoThreads {
    public static void main(String[] args) {
        Runnable r1 = () -> { for(int i=0;i<5;i++) System.out.println("Hello"); };
        Runnable r2 = () -> { for(int i=0;i<5;i++) System.out.println("World"); };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}

//World
//World
//World
//World
//World
//Hello
//Hello
//Hello
//Hello
//Hello
