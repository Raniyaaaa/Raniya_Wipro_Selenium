package day_7;

//Create a thread by implementing the Runnable interface that prints the current thread name.

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Running: " + Thread.currentThread().getName());
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}

//Running: Thread-0