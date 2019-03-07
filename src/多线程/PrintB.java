package 多线程;

public class PrintB implements  Runnable {
    @Override
    public void run() {

        for(int i = 0 ; i <5;i++)
            System.out.printf("%-3s","B");
    }
}
