package 多线程;

public class PrintC implements Runnable {



    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
//            try {
//                Thread.sleep(200);//当前线程 休眠多长时间，单位是毫秒 1秒=1000毫秒
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.printf("%-3d", 0);
            /*1.新创建：只是被new出来成为一个对象
              2.可运行：一个线程所需要的所有条件都已经满足，就差cpu
              3.被阻塞：一个线程需要条件不能被满足，或者等待某些资源
              4.被终止：一个线程已经发出的终止命令，即将消亡，如Linux的15信号
              5.计时等待


              新生（新创建）
              就绪
              运行
              消亡（被终止）
             */

        }
    }
}