package day_7;

//Create a thread that performs a simple task (like multiplication) and returns result using Callable and Future

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        Callable<Integer> task = () -> 5 * 10;

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> result = executor.submit(task);

        System.out.println("Result: " + result.get());
        executor.shutdown();
    }
}

//Result: 50