import java.util.*;
public class Twocollec {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("   hey");
        ls.add(" helloo     ");
        ls.add("  hi   ");
            System.out.println(ls);
        System.out.println("after trimming");
        Iterator<String> itr = ls.iterator();
        List<String> la=new ArrayList<>();
        while (itr.hasNext()) {
            la.add(itr.next().trim());
        }
        System.out.println(la);//printing in this format because spaces are visible
    }
}
