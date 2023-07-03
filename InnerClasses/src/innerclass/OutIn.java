package innerclass;

public class OutIn {
    String s1="iam outer variable";
    static String s2="iam outer static variable";
    //creating inner class ie creating class inside class
    class InOut{
        String s1="iam inner class variable";

        public void show(){
            System.out.println("iam show method from inner clss");
            String s1="iam local variable of inner class";

            //to access local variable
            System.out.println("printing local variable value "+s1);

            //to access instance variable, we use this keyword as it refers to current object
            System.out.println("printing instance vriable "+this.s1);

            //to access outer class variable from inner class we use class name refernce
            System.out.println("printning outer class variable "+OutIn.this.s1);


        }
    }

    public void display(){
        System.out.println("in outer class method");

    }

    public static void main(String[] args) {
        //object creation of outer class
        OutIn oi=new OutIn();
        //object creation of inner class using ref of outer class
        OutIn.InOut io=oi.new InOut();
        //calling methods of respective classes with their objects
        oi.display();
        io.show();
    }
}
