package li.jesse.datastructure.hash;

import org.junit.Test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class HashTableTest {

    @Test
    public void testHashtableAPIs() {
        Random r = new Random();
        Hashtable hashtable = new Hashtable();
        hashtable.put("one", r.nextInt(10));
        hashtable.put("two", r.nextInt(10));
        hashtable.put("three", r.nextInt(10));

        System.out.println(hashtable);

        Iterator iter = hashtable.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry entry = (Map.Entry)iter.next();
            System.out.println("next : "+ entry.getKey() +" : "+entry.getValue());
        }

        System.out.println("size:"+hashtable.size());

        System.out.println("contains key two : " + hashtable.containsKey("two"));
        System.out.println("contains key five : " + hashtable.containsKey("five"));
    }
}
