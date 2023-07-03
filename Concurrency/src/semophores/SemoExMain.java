package semophores;

import java.util.concurrent.Semaphore;

public class SemoExMain {
    public static void main(String[] args) throws InterruptedException {
        //creating object of semophores with 1permit, so that only 1thread can get resource &
// other has to wait until thread releases the permit
        Semaphore smp = new Semaphore(1);

        myThread t1 = new myThread(smp, "hi");
        myThread t2 = new myThread(smp, "hello");
        myThread t3 = new myThread(smp, "sindhu");
        //starting the respective threads
        t1.start();
        t2.start();
        t3.start();
        //waiting for threads to complete their execution
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Count value is " + SemoEx.semcount);
    }
}
