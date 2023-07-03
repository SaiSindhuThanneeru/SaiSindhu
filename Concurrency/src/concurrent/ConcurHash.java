package concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class ConcurHash extends Thread {
    //static HashMap hm=new HashMap(); this will raise concurrentmodification exception
    static ConcurrentHashMap chm = new ConcurrentHashMap();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
        }
        System.out.println("updating values using child thread");
        chm.put(3, "c");
    }

    public static void main(String args[]) throws InterruptedException {
        chm.put(1, "a");
        chm.put(2, "b");
        ConcurHash ch = new ConcurHash();
        ch.start();//starting child thread.
        Set s = chm.keySet();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            Integer i = (Integer) itr.next();
            System.out.println("our main thread is iterating & the current entry is " + chm.get(i));
            Thread.sleep(3000);//making main thread to sleep for 3sec
        }
        System.out.println(chm);
    }

}
