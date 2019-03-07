package 多线程;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private  Lock bankLock;
    private final double[] accounts;
    private Condition sufficientFunds;

    public Bank(int  n,double initialBlance) {
        accounts = new double[n];
        Arrays.fill(accounts,initialBlance);
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();


    }
    public void transfer(int from ,int to,double amount) {
        bankLock.lock();
        try {


            if (accounts[from] < amount)
                sufficientFunds.await();
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total Balance:%10.2f%n", getTotalBalance());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bankLock.unlock();

        }
        }

    public  double getTotalBalance(){
        double sum =0 ;
        for (double a : accounts)
            sum+=a;
        return  sum;
    }
    public int size(){
        return  accounts.length;
    }

}
