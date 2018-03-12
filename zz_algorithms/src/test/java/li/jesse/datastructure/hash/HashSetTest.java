package li.jesse.datastructure.hash;

import java.util.HashSet;

public class HashSetTest {

    public void testHashSetAPIs() {
        HashSet hashSet = new HashSet();

        for (int i=0; i<5; i++) {
            hashSet.add(""+i);
        }
    }
}
