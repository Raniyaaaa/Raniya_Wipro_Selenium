package day_7;

//Write a program to demonstrate thread group creation and management.

public class ThreadGroupExample {
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup");

        Runnable r = () -> System.out.println(Thread.currentThread().getName());
        new Thread(group, r, "T1").start();
        new Thread(group, r, "T2").start();

        System.out.println("Active threads: " + group.activeCount());
    }
}

//T1
//T2
//Active threads: 2