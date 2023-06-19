import java.util.*;

public class Collec {
    public static void main(String[] args) {
        ArrayList<String> as = new ArrayList<String>();
        as.add("sai");
        as.add("sindhu");
        as.add("manu");
        as.add("kavya");
        as.add("anusha");
        //printing objects in arraylist using iterator
        Iterator<String> itr = as.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println();
        System.out.println("randomly printing");
        System.out.println();
        //printing elements randomly
        Collections.shuffle(as);
        Iterator<String> itrtr = as.iterator();
        while (itrtr.hasNext()) {
            System.out.println(itrtr.next());
        }
   }
}
