package cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarrierEx extends Thread {
    private int duration;
    private CyclicBarrier barrier;

    public BarrierEx(int duration, CyclicBarrier barrier, String name) {
        super(name);
        this.duration = duration;
        this.barrier = barrier;
    }

    public void run() {
        try {
            Thread.sleep(duration);
            System.out.println(Thread.currentThread().getName() + " is calling await");
            barrier.await();//after execution of tasks, threads call this method to ensure
            //all other threads reach the barrier
            //in output, after all threads call this, then only after code is executed
            System.out.println(Thread.currentThread().getName() + " has started running again");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } catch (BrokenBarrierException bbe) {
            bbe.printStackTrace();
        }
    }

}
