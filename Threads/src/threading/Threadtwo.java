package threading;

public class Threadtwo extends Thread{
    private Threadone tone;
    public  Threadtwo(Threadone o)
    {
        this.tone=o;
    }
    public void setTone(Threadone a)
    {
        this.tone=a;
    }

    public void run()
    {
        try
        {
            Thread.sleep(1000);
            synchronized (tone)
            {
                tone.notifyAll();//relieving from wait state from synchronized
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
