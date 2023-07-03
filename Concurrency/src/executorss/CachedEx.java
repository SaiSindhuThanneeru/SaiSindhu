package executorss;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CachedEx implements Runnable {
    public String k;
    public int rollno;

    public CachedEx(String k) {
        this.k = k;

    }

    public void run() {
        String s = Thread.currentThread().getName();
        for (int i = 0; i < 4; i++) {
            System.out.println(s + " of " + k + " in iteration of " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        //cachedthread creates thread pool that creates new threads as needed and also reuses previously created threads when available
        CachedEx[] c = {new CachedEx("1Sindhu"),
                new CachedEx("2Sindhu")};

        for (CachedEx cc : c) {
            es.submit(cc);
            Future f = es.submit(cc);
        }
    }
}
