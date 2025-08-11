package day_7;

//Write a program to create a thread by extending the Thread class and print numbers from 1 to 5.

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        new MyThread().start();
    }
}


//1
//2
//3
//4
//5