package methodlocalinner;

public class Methodlocal {
    static int a = 23;
    int b = 24;

    public void display() {
        int c = 25;
        class Insidemthod {
            int d = 26;

            void display() {
                int d = 27;
                System.out.println("iam inner method of the method of outer class");
                System.out.println("printing d value from outside method " + this.d);
                System.out.println("printing d value from inside method " + d);
            }
        }
        //creating object of inner class inside method only, as we class scope is within method
        Insidemthod im = new Insidemthod();
        im.display();
    }

    public static void main(String[] args) {
        Methodlocal ml = new Methodlocal();
        ml.display();
    }
}
