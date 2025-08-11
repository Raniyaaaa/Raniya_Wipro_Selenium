package day_7;

//Create a thread and use Thread.yield() to pause and give chance to another thread.

public class YieldExample {
    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.yield();
            }
        };
        new Thread(r, "Thread A").start();
        new Thread(r, "Thread B").start();
    }
}

//Thread B: 1
//Thread A: 1
//Thread B: 2
//Thread B: 3
//Thread A: 2
//Thread A: 3