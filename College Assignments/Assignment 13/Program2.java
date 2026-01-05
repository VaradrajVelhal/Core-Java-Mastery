
//Write a Java program to create a thread pool using ExecutorService and
//submit multiple tasks for execution. Use invokeAll() to wait for all tasks to
//complete and invokeAny() to get the result of the first completed task.
import java.util.*;
import java.util.concurrent.*;

public class Program2 {
    public static void main(String[] args) throws Exception {

        ExecutorService service = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = new ArrayList<>();

        tasks.add(() -> "Task 1 completed");
        tasks.add(() -> "Task 2 completed");
        tasks.add(() -> "Task 3 completed");

        // invokeAll() – waits for all tasks
        List<Future<String>> results = service.invokeAll(tasks);

        System.out.println("Results from invokeAll():");
        for (Future<String> f : results) {
            System.out.println(f.get());
        }

        // invokeAny() – returns first completed task result
        String firstResult = service.invokeAny(tasks);
        System.out.println("\nResult from invokeAny(): " + firstResult);

        service.shutdown();
    }
}
