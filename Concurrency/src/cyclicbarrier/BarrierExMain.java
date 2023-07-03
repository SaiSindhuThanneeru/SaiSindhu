package cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

public class BarrierExMain {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        CyclicBarrier barrier = new CyclicBarrier(4);//specifying no.of threads that barrier should wait upon
        BarrierEx be1 = new BarrierEx(1000, barrier, "Thread1");
        BarrierEx be2 = new BarrierEx(1500, barrier, "Thread2");
        BarrierEx be3 = new BarrierEx(2000, barrier, "Thread3");
        BarrierEx be4 = new BarrierEx(2500, barrier, "Thread4");

        be1.start();
        be2.start();
        be3.start();
        be4.start();

        System.out.println(Thread.currentThread().getName() + " has finished");
    }
}
