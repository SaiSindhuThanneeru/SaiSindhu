package staticnested;

public class Outer {
    static int a=10;
    int b=20;
    static class Inner1{
        int a=20;
        static class Inner2{
            int a=30;
            static void show(){
                System.out.println("iam static 1st inner class");
                //System.out.println("printing static variable a value "+a);
                //calling non static varible from static not possible
                //System.out.println("printing variable of present class "+this.a);
                //as method is static this cant be used
                System.out.println("printing static variable "+Outer.a);
            }
        }
        public void show(){
            int a=25;
            System.out.println("iam static 2nd inner class");
            System.out.println("printing  variable value inside method "+this.a);
            System.out.println("printing instance variable value  "+a);//method is not static so it prints
        }
    }
    public void show(){
        System.out.println("printing sttic variable value "+a);
        System.out.println("printing instnce variable value "+b);
    }

    public static void main(String[] args) {
        Outer o=new Outer();
        o.show();//calling outer class method
        Outer.Inner1 oi=new Inner1();//as static ref is not used
        oi.show();
        System.out.println("printing a value of inner class "+oi.a);
        System.out.println("printing static variable "+a);
        //calling 2nd inner static class's static method
        Outer.Inner1.Inner2.show();
    }
}
