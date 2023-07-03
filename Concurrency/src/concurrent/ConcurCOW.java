package concurrent;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class ConcurCOW extends Thread {
    static CopyOnWriteArrayList cow = new CopyOnWriteArrayList();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {

        }
        System.out.println("child thread adding element");
        cow.add("sindhu");
    }

    public static void main(String args[]) throws InterruptedException {
        cow.add("abcd");
        cow.add("sai");
        ConcurCOW cc = new ConcurCOW();
        cc.start();
        Iterator itr = cow.iterator();
        //cow.add("t");this doesnot get updated in cow object in copyonwritearraylist & iterator is forwarded sequence, it doesnt update & cloned copy of after creating iterator brings inconsistency
        //by jvm while joining data to print all elements
        while (itr.hasNext()) {
            String s1 = (String) itr.next();
            System.out.println("main thread iterating this list & current obj is " + s1);
            Thread.sleep(3000);//when this thread sleeps child threads executes its code
        }
        Iterator i = cow.iterator();
        while (i.hasNext()) {
            String s = (String) i.next();
            if (s.equals("sindhu")) {
                //i.remove();//copyonwritearraylist doesnt perform remove operation as cloned copy get created
                //hence we will get unsupportd operatio exception
                //this collection mainly used at times when we have more read operations & less write operations
            }
        }
        System.out.println(cow);
    }
}
