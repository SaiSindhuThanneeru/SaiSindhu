package threading;
import java.lang.*;
public class Ttwo implements Runnable{
    private Thread t;
    private String threadname;
    Ttwo( String name) {
        threadname = name;
        System.out.println("Creating " +  threadname );
    }
    public void run() {
        System.out.println("Running thread " + threadname);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadname + "subthread" + i);
                // Let the thread sleep for a while.
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public void start() {
            System.out.println("Starting " + threadname);
            if (t == null) {
                t = new Thread(this, threadname);
                t.start();

        }
    }
    public static void main(String[] args) {
        Ttwo tw1=new Ttwo("Thread_1");
        tw1.start();
        Ttwo tw2=new Ttwo("Thread_2");
        tw2.start();
    }
}
