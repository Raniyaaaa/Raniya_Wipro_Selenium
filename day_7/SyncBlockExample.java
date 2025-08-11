package day_7;

//Write a Java program using synchronized block to ensure mutual exclusion.

public class SyncBlockExample {
    static int counter = 0;
    static Object lock = new Object();

    static void increment() {
        synchronized (lock) {
            counter++;
        }
    }

    public static void main(String[] args) throws Exception {
        Runnable r = () -> { for (int i = 0; i < 1000; i++) increment(); };
        Thread t1 = new Thread(r), t2 = new Thread(r);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Counter: " + counter);
    }
}

//Counter: 2000