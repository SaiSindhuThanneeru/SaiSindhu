package anonymousinner;

public class UsingTHread {
    public static void main(String[] args) {
        Thread t=new Thread(){
                              //if we want to define only run method & not do any other operations
                              //instead of keeping the code in seperate class, we create define
                              //in this block of code, as there is no name for class
                              //it is called anonymous class
                            public void run(){

                                for(int i=0;i<3;i++){
                                    System.out.println(i+" from child thread");
                                }
                            }
        };
        t.start();//child run is executed
        //remaining code is executed by parent thread
        for(int i=0;i<3;i++){
            System.out.println(i+" from parent thread");
        }
    }
}
