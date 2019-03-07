package 多线程;

public class PrintA implements Runnable {
    @Override
    public void run() {
        Thread thread = new Thread(()->{
      for (int i = 0; i < 5; i++) {
            System.out.printf("%-3S", "F");
        }
        });
        thread.start();
        for(int i=0;i<5;i++){
            if ( i == 3 ) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            }
//            Thread.yield();
            //通知CPU该线程可以让出CPU给其他线程执行
            System.out.printf("%-3s", "d");
            //只要5个F打印完毕后，还剩下两个及其以上的d，结果都是对的

        }

    }
