package 多线程;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

public class Java {
    public static void main(String[] args) throws IndexOutOfBoundsException, InterruptedException {
       ConcurrentHashMap<String, LongAdder> concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.put("tom",new LongAdder());
        ExecutorService executorService =
                Executors.newFixedThreadPool(10);
        Runnable r = ()->{
            concurrentHashMap.putIfAbsent("tom",new LongAdder()).increment();

        };
        for(int i = 0 ; i<10;i++) {
            executorService.execute(r);
        }

        Thread.sleep(3000);
        executorService.shutdown();

        System.out.printf(String.valueOf(concurrentHashMap.get("tom")));
    }

}
