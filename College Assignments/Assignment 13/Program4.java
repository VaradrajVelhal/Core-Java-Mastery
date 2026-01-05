
//Write a Java program to use the Fork/Join framework to perform a parallel
//computation. Create a recursive task that divides a large problem into
//smaller sub-tasks and combines the results.
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

class SumTask extends RecursiveTask<Integer> {

    int start, end;

    SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    protected Integer compute() {
        // small task → compute directly
        if (end - start <= 5) {
            int sum = 0;
            for (int i = start; i <= end; i++)
                sum += i;
            return sum;
        }

        // divide task
        int mid = (start + end) / 2;

        SumTask left = new SumTask(start, mid);
        SumTask right = new SumTask(mid + 1, end);

        left.fork(); // run left in parallel
        int rightResult = right.compute();
        int leftResult = left.join();

        return leftResult + rightResult;
    }
}

public class Program4 {
    public static void main(String[] args) {

        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(1, 20);

        int result = pool.invoke(task);
        System.out.println("Sum = " + result);
    }
}
