package day_7;

//Write a program that demonstrates inter-thread communication using wait() and notifyAll().

public class WaitNotifyAllExample {
    static class Shared {
        synchronized void printMessage(String msg) {
            System.out.println(msg);
            notifyAll();
        }
    }

    public static void main(String[] args) {
        Shared s = new Shared();

        Runnable r = () -> {
            synchronized (s) {
                try { s.wait(); } catch (Exception e) {}
                System.out.println(Thread.currentThread().getName() + " resumed");
            }
        };

        new Thread(r, "T1").start();
        new Thread(r, "T2").start();

        try { Thread.sleep(500); } catch (Exception e) {}
        s.printMessage("Notifying all threads...");
    }
}

//Notifying all threads...
//T1 resumed
//T2 resumed

