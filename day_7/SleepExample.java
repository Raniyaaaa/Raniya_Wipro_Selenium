package day_7;

//Demonstrate the use of Thread.sleep() by pausing execution between numbers from 1 to 3.

public class SleepExample {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}

//1
//2
//3
