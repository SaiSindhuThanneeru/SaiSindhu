package concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurMeth {
    public static void main(String args[]) {
        ConcurrentHashMap chm = new ConcurrentHashMap();
        chm.put(1, "a");
        chm.put(2, "b");
        chm.put(3, "c");
        chm.put(5, "f");
        chm.putIfAbsent(4, "d");//add the key, value if the key is not present in chm
        chm.putIfAbsent(2, "p");//asit is already present, no chng in chm
        chm.remove(6, "y");//removes key, value only if mentioned key is present
        chm.remove(5, "e");
        chm.replace(5, "f", "e");//replaces the value of the key only if given key&value matches
        System.out.println(chm);//printing chm elements.
    }
}
//we use concurrent hashmap,copyon write arraylist/arrayset as they provide thread safety & cloning of objecthelps perform
//more write operations when compared to vector,synchronized list/set