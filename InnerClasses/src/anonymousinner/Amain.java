package anonymousinner;

public class Amain {
    public static void main(String[] args) {
        A obj =new A()
        {
            public void show()
            {
                System.out.println("Good Morning");//sometimes we expect different output without changing actual method definition, we use this approach
            }
        };
        obj.show();
    }
}
