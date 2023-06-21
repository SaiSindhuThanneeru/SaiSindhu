import java.util.*;
public class WildGen {


    //upperuounded wildcard
    public static void display(List<? extends Number> l)
    {
        for(Number i:l)
        {
            System.out.println(i);
        }
    }

    //lowerbounded wildcard
    public static void displayy(List<? super String> l)
    {
        for(Object i:l)
        {
            System.out.println(i);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        WildGen wg=new WildGen();
        List<Integer> l1=new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        display(l1);
        List<String> l2=new ArrayList<String>();
        l2.add("hi");
        l2.add("hello");
        l2.add("hey");
        displayy(l2);
    }
}
