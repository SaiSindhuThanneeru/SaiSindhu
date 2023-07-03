package blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<Integer> bq;
    String msg;

    public Producer(BlockingQueue<Integer> bq, String msg) {
        this.bq = bq;
        this.msg = msg;
    }

    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                bq.put(i);//adding elements to blockingqueue
                System.out.println(msg + " " + i);
                Thread.sleep(2000);
            }
            bq.put(-1);//we cannot put more elements
            System.out.println("Produced full");

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
