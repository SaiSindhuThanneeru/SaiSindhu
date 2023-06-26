package threading;
import java.lang.*;
public class Tone extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Thread "+i+" is running");
        }
    }
    public static void main(String[] args)
    {
        //creating instance of class that extends thread class, as passing nme thread string
        Tone t1=new Tone();
        //call start method to execute run method thread
        t1.start();
        System.out.println("THread name is: "+t1.getName());//prints name of thread
        System.out.println("Priority of thread "+t1.getPriority());
    }
}
