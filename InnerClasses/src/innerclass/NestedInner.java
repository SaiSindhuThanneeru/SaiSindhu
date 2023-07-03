package innerclass;

public class NestedInner {
    class Mall{
        int a=23;
        class Floors{
            public void display(){
                System.out.println("iam inner inner class  ie nested class");
                System.out.println("printing my outer class variable value "+a);//all data members can be accessed by its inner class

            }
        }
        public void display1(){
            System.out.println("iam 1st inner class");
        }
    }
    public void display2(){
        System.out.println("iam outer class method");
        //we cannot access inner data members & inner data methods
    }

    public static void main(String[] args) {
        //creating objects for respective classes
        NestedInner ni=new NestedInner();
        //creating inner class object with outer class reference
        NestedInner.Mall m=ni.new Mall();
        //creating 2nd nested class object with reference of both its outer classes
        NestedInner.Mall.Floors f=m.new Floors();
        ni.display2();
        m.display1();
        f.display();
    }
}
