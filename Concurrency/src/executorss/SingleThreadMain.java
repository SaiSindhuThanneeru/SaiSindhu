package executorss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadMain {
    public static void main(String[] args) {
        //creating threadpool containing single thread
        ExecutorService es = Executors.newSingleThreadExecutor();
        //we use singlethreadexecutor when we want the tasks to execute in fixed order(sequencially)
        for (int i = 0; i < 4; i++) {

            Runnable r = new SingleThread("myThread is " + i);

            es.execute(r);
        }
        es.shutdown();
        //waiting for all threads to get finished
        while (!es.isTerminated())
            ;
        System.out.println("All threads finished execution");
    }
}
