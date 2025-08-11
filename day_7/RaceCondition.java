package day_7;

//Create a program with multiple threads that access a shared counter without synchronization. Show the race condition.

public class RaceCondition {
    static int counter = 0;

    static void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> { for (int i = 0; i < 1000; i++) increment(); };
        Thread t1 = new Thread(r), t2 = new Thread(r);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final counter: " + counter);
    }
}

//Final counter: 2000
