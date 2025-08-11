package day_7;

//Solve the above problem using synchronized keyword to prevent race condition.

public class SyncExample {
    static int counter = 0;

    synchronized static void increment() {
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
