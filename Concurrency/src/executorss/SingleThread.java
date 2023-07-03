package executorss;

import java.lang.*;

public class SingleThread implements Runnable {
    private String name;

    public SingleThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Starting execution " + name);

        try {
            Thread.sleep(1000);
            System.out.println("Executing " + name);
            System.out.println("HI, iam Sindhu and " + name);
        } catch (InterruptedException ie) {//interruptedex is thrown if thread is interrupted while waiting
            ie.printStackTrace();
        }
        System.out.println("Finished Execution " + name);
        System.out.println();
    }

}
