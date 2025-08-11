package day_7;

//Implement a program where two threads print even and odd numbers respectively.

public class EvenOddThreads {
    public static void main(String[] args) {
        Runnable even = () -> { for (int i = 0; i <= 10; i += 2) System.out.println("Even: " + i); };
        Runnable odd = () -> { for (int i = 1; i <= 9; i += 2) System.out.println("Odd: " + i); };
        new Thread(even).start();
        new Thread(odd).start();
    }
}


//Even: 0
//Even: 2
//Even: 4
//Even: 6
//Even: 8
//Odd: 1
//Odd: 3
//Odd: 5
//Odd: 7
//Odd: 9
//Even: 10
