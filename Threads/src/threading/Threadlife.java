package threading;
import java.lang.*;
public class Threadlife extends Thread{
    public void run()
    {
        for(int i=0;i<5;i++) {
            try {
                System.out.println("thread entering waiting state "+i);
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Threadlife tl1=new Threadlife();
        Threadlife tl2=new Threadlife();
        System.out.println("state of thread before calling start method "+tl1.getState());
        tl1.start();
        tl2.start();
        System.out.println("getting state of thread after calling start method "+tl2.getState());

        try{
            Thread.sleep(1001);
            System.out.println("state of thread after running sleep method");

        }
        catch(Exception e){
            e.printStackTrace();
        }
     synchronized (tl1)//notifyall, notify can be called using synchronied
     {
        tl1.notify();//notifies for 1thread which is waiting, notifyall-multiple threads
         System.out.println("state after notify method "+tl1.getState());//getting states of thread in its life cycle
     }
    }
}//suspend,yield,join are some of the other methods
