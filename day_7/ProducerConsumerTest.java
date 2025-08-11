package day_7;

// Create a Producer-Consumer problem using wait() and notify().

import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    Queue<Integer> queue = new LinkedList<>();
    int limit = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == limit) wait();
        queue.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) wait();
        int val = queue.poll();
        System.out.println("Consumed: " + val);
        notify();
        return val;
    }
}

public class ProducerConsumerTest {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { pc.produce(i); } catch (Exception e) {}
            }
        }).start();

        new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { pc.consume(); } catch (Exception e) {}
            }
        }).start();
    }
}


//Produced: 1
//Produced: 2
//Produced: 3
//Produced: 4
//Produced: 5
//Consumed: 1
//Consumed: 2
//Consumed: 3
//Consumed: 4
//Consumed: 5
