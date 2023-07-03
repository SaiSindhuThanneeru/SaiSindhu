package blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    BlockingQueue<Integer> b;
    String msg;
    int i = 0;

    public Consumer(BlockingQueue<Integer> b, String msg) {
        this.msg = msg;
        this.b = b;
    }

    public void run() {
        while (i != -1) {
            try {
                i = b.take();
                System.out.println(msg + " " + i + " running thread is " + Thread.currentThread().getName());
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
}
