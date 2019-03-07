package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
class su implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return 0;
    }
}

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> task = new FutureTask<>(new su());
new Thread(task).start();

    System.out.println(task.isDone());
    System.out.println(task.get());
}
    }

