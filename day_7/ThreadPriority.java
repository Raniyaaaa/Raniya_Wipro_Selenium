package day_7;

//Create a program that starts three threads and sets different priorities for them.

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Low priority"));
        Thread t2 = new Thread(() -> System.out.println("Medium priority"));
        Thread t3 = new Thread(() -> System.out.println("High priority"));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start(); t2.start(); t3.start();
    }
}

//High priority
//Medium priority
//Low priority
