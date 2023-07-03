package phrasers;
import java.util.concurrent.Phaser;
public class PhraseEx implements Runnable{
    Phaser p;
    int n;

    public PhraseEx(Phaser p,int n){
        this.p=p;
        this.n=n;
        p.register();
        new Thread(this).start();
    }
    public void run(){
        System.out.println(n+" phase0 started");
        if(n%2==0){
            System.out.println(n+" is even number");
        }
        else
            System.out.println(n+" is odd number");
        p.arriveAndAwaitAdvance();
        try{
            Thread.sleep(1500);//making it wait for.5sec, eventhgh another thread doesn't comes in
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("phase1 has started");

        p.arriveAndAwaitAdvance();
        try{
            Thread.sleep(2500);//making thread wait for 2.5sec
        }
        catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("phase 2 started");
        p.arriveAndDeregister();
    }
}
