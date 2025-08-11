package day_7;

public class StopThreadExample {
    static class MyTask implements Runnable {
        volatile boolean running = true;
        public void run() {
            while (running) {
                System.out.println("Running...");
                try { Thread.sleep(500); } catch (Exception e) {}
            }
        }
    }

    public static void main(String[] args) throws Exception {
        MyTask task = new MyTask();
        Thread t = new Thread(task);
        t.start();
        Thread.sleep(2000);
        task.running = false;
    }
}

//Running...
//Running...
//Running...
//Running...
