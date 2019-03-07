package 多线程;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class printrun {
    public static void main(String[] args) {





//            new Thread(new PrintA()).start();//用来new一个线程
//            new Thread(new PrintB()).start();
//            //start 方法自动调用run方法，而且start方法不是阻塞的
//            new Thread(new PrintC()).start();
        ExecutorService executorService =
                Executors.newFixedThreadPool(5);//创建有三个线程的线程池   ，主要可以提升运行速度
        executorService.execute(new PrintC());
        executorService.execute(new PrintB());
        executorService.execute(new PrintA());
        executorService.shutdown();//等待ABC结束后关闭线程池
        }

}