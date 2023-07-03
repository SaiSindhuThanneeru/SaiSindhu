package executorss;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.*;

public class CallableCall implements Callable<Integer> {
    int i;
    int r = 0;

    CallableCall(int i) {
        this.i = i;
    }

    public Integer call() {
        System.out.println("dsiplaying reverse of " + i + " number" + " starting current thread" + Thread.currentThread().getName());
        while (i != 0) {

            //getting last digit from i
            int digit = i % 10;
            r = r * 10 + digit;

            //removing the last digit from i
            i /= 10;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        return r;
    }

    public static void main(String[] args) {
        CallableCall[] cc = {new CallableCall(3242),
                new CallableCall(536)};
        //es will create thread pool with fixed no of threads
        ExecutorService es = Executors.newFixedThreadPool(3);
        try {
            for (CallableCall c : cc) {
                Future<Integer> f = es.submit(c);//future object takes the return value as submit method has return type & execute method return s void
                System.out.println("reverse of number is " + f.get());
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } catch (ExecutionException ee) {
            ee.printStackTrace();
        }
    }
}
