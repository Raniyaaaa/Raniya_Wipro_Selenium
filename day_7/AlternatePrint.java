package day_7;

//Create a program where one thread prints A-Z and another prints 1-26 alternately.

public class AlternatePrint {
    static Object lock = new Object();
    static boolean letterTurn = true;

    public static void main(String[] args) {
        Thread letters = new Thread(() -> {
            for (char c = 'A'; c <= 'Z'; c++) {
                synchronized (lock) {
                    while (!letterTurn) try { lock.wait(); } catch (Exception e) {}
                    System.out.print(c + " ");
                    letterTurn = false;
                    lock.notify();
                }
            }
        });

        Thread numbers = new Thread(() -> {
            for (int i = 1; i <= 26; i++) {
                synchronized (lock) {
                    while (letterTurn) try { lock.wait(); } catch (Exception e) {}
                    System.out.print(i + " ");
                    letterTurn = true;
                    lock.notify();
                }
            }
        });

        letters.start();
        numbers.start();
    }
}

// A 1 B 2 C 3 D 4 E 5 F 6 G 7 H 8 I 9 J 10 K 11 L 12 M 13 N 14 O 15 P 16 Q 17 R 18 S 19 T 20 U 21 V 22 W 23 X 24 Y 25 Z 26 