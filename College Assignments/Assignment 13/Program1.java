//Write a Java program to use the Callable interface and Future class to
//perform a task that returns a result.Create a Callable task that performs 
//a computation and retrieves the result using Future

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program1 {
    public static void main(String[] args) throws Exception {

        Callable<Integer> task = () -> {
            int sum = 0;
            for (int i = 1; i <= 5; i++)
                sum += i;
            return sum;
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> result = service.submit(task);

        System.out.println("Result = " + result.get());

        service.shutdown();
    }
}
