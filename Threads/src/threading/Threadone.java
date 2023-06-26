package threading;

public class Threadone extends  Thread{
    public void run()
    {
        for(int i=0;i<5;i++){
            System.out.println("Thread no- "+i);
        }
        synchronized (this)
        {
            try{
                wait();//thread will be in running state
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
