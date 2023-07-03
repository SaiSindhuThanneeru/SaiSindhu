package blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainConPro {
    public static void main(String[] args) {


        BlockingQueue<Integer> b = new ArrayBlockingQueue<>(5);//creating arraybq with 5capacity
        //creating producer object & pass to common buffer created above
        Producer p = new Producer(b, "hi! P");
        Consumer c = new Consumer(b, "hello! c");
        Consumer cc = new Consumer(b, "hello cc");//2nd consumer

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(cc);


        t1.start();
        t2.start();
        t3.start();
    }
}
