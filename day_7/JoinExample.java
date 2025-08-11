package day_7;

//Write a program to demonstrate Thread.join() – wait for a thread to finish before proceeding.

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 3; i++) System.out.println("Child: " + i);
        });
        t.start();
        t.join();
        System.out.println("Main thread after child finished");
    }
}

//Child: 1
//Child: 2
//Child: 3
//Main thread after child finished
