package executorss;

import java.util.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadEx implements Runnable {
    public String msg;

    public FixedThreadEx(String msg) {
        this.msg = msg;
    }

    public void run() {
        //tasks to be performed
        System.out.println("Starting : " + Thread.currentThread().getName());
        System.out.println(msg);
        System.out.println("this is " + msg + " obj");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Ending : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        FixedThreadEx[] ft = {new FixedThreadEx("1Sindhu"),
                new FixedThreadEx("2Sindhu"),
                new FixedThreadEx("3Sindhu"),
                new FixedThreadEx(("4Sindhu"))};
        //creating executorservice obj to create thread pool with fixed no of threads

        ExecutorService es = Executors.newFixedThreadPool(3);//creating 3threads to perform task
        //if there are additional tasks, while all threads are active, they will wait in queue
        //until the thread is available

        for (FixedThreadEx ls : ft) {
            es.submit(ls);//using this method, we are assigning the tasks to threads

        }
        es.shutdown();
        //waiting for all threads to finish
        while (!es.isTerminated())
            ;
        System.out.println("all threads finished execution");
    }

}
