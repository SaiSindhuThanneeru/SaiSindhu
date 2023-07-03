package reentrant;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Rentrant implements Runnable {
    String name;
    ReentrantLock rl;

    public Rentrant(String name, ReentrantLock rl) {
        this.name = name;
        this.rl = rl;
    }

    public void run() {
        boolean finish = false;
        while (!finish) {

            try {
                if (rl.tryLock(2100, TimeUnit.MILLISECONDS)) {
                    System.out.println(name + " " + Thread.currentThread().getName() + " is locked");
                    System.out.println("Lock Hold COunt is " + rl.getHoldCount());
                    Thread.sleep(2500);
                    rl.unlock();//releases the lock
                    System.out.println(name + " " + Thread.currentThread().getName() + " is released");
                    System.out.println("Lock Hold COunt is " + rl.getHoldCount());
                    System.out.println(name + " task completed");
                    break;//if task is completed, breaks the loop & another thread continues to get lock
                } else {
                    System.out.println("no available lock for " + Thread.currentThread().getName());
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            } finally {
                System.out.println("all tasks have executed");
            }

        }
    }

    public static void main(String[] args) {
        ReentrantLock r = new ReentrantLock();
        ExecutorService es = Executors.newFixedThreadPool(2);
        Runnable r1 = new Rentrant("hitachi", r);
        Runnable r2 = new Rentrant("vantara", r);
        es.execute(r1);
        es.execute(r2);
        es.shutdown();

    }

}
