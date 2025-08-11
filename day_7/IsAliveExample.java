package day_7;

//Demonstrate the use of Thread.isAlive() to check thread status.

public class IsAliveExample {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 3; i++) System.out.println("Working...");
        });
        System.out.println("Before start: " + t.isAlive());
        t.start();
        System.out.println("After start: " + t.isAlive());
        t.join();
        System.out.println("After finish: " + t.isAlive());
    }
}


//Before start: false
//Working...
//Working...
//Working...
//After start: true
//After finish: false
