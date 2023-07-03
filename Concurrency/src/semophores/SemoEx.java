package semophores;

import java.util.concurrent.Semaphore;

public class SemoEx {
    static int semcount = 5;
}

class myThread extends Thread {
    Semaphore sm;
    String msg;

    public myThread(Semaphore sm, String msg) {
        super(msg);
        this.sm = sm;
        this.msg = msg;
    }

    public void run() {
        if (this.getName().equals("hi")) {
            System.out.println("Starting " + msg);
            try {
                //according to semophores, before we give lock, we need to give permits to the thread
                System.out.println(msg + " thread is waiting for permit");
                //giving permit to thread using permit method
                sm.acquire();
                System.out.println(msg + " thread got permit");

                //now we access the shared resource, other threads will wait
                //until this thread releases the lock
                for (int i = 0; i < 5; i++) {
                    SemoEx.semcount++;//when thread no longer require resource we increment count value
                    System.out.println(msg + " count is " + SemoEx.semcount);
                    Thread.sleep(1300);//allowing another thread to execute
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            //operations completed, releasing the permit
            System.out.println(msg + " releasing the permit");
            sm.release();
        }
        //another thread runs this block, when if condition fails
        else {
            System.out.println("Starting thread " + msg);
            try {
                System.out.println(msg + " thread is waiting for permit");
                sm.acquire();
                System.out.println(msg + " thread got permit");

                for (int i = 0; i < 5; i++) {
                    SemoEx.semcount--;//resource is taken by thread
                    System.out.println(msg + " count is " + SemoEx.semcount);
                    Thread.sleep(1300);//another thread executes in the mean time
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
            System.out.println(msg + " thread releasing the permit");
            sm.release();
        }


    }
}
