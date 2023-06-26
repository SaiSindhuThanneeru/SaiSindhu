package threading;

public class Threadmain {
    public static void main(String[] args) {
        Threadone o=new Threadone();
        Threadtwo t=new Threadtwo(o);
        System.out.println("state of thread "+o.getState());
        System.out.println("stte of thread "+t.getState());
        o.start();
        t.start();
        System.out.println("state of thread1 "+t.getState());
        System.out.println("state of thread2 "+t.getState());

    }
}
