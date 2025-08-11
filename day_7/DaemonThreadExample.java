package day_7;

import java.time.LocalTime;

//Create a daemon thread that runs in background and prints time every second.

public class DaemonThreadExample {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(() -> {
            while (true) {
                System.out.println(LocalTime.now());
                try { Thread.sleep(1000); } catch (Exception e) {}
            }
        });
        t.setDaemon(true);
        t.start();

        Thread.sleep(5000);
}   }


//08:48:39.476683400
//08:48:40.490659900
//08:48:41.504006100
//08:48:42.512406400
//08:48:43.522505800