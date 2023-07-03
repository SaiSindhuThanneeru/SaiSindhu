package staticinner;

public class StatInner {
    int a=10;
    static int b=20;
    //creating static inner class
    static class Stats{
        int a=20;
        public void display(){
            int a=3;
            System.out.println("printing instance variable from method "+a);
            System.out.println("printing local variable with same name as instance variable "+this.a);
        }
    }
    void display(){
        System.out.println("iam method of normal class");
    }

    public static void main(String[] args) {
        StatInner si=new StatInner();
        si.display();
        //creating object of inner static class using ref of outer class
        StatInner.Stats ss=new Stats();
        ss.display();
    }
}
