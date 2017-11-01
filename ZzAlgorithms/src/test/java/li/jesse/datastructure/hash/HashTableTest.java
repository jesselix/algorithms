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

        // traverse key-value of the map
        Iterator iterator = hashtable.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("next : "+ entry.getKey() +" : "+entry.getValue());
        }

        System.out.println("size:" + hashtable.size());

        // contain key
        System.out.println("contains key two: " + hashtable.containsKey("two"));
        System.out.println("contains key five: " + hashtable.containsKey("five"));

        // contain value
        System.out.println("contains value 0: "+hashtable.containsValue(new Integer(0)));

        hashtable.remove("three");

        System.out.println("table:" + hashtable);

        hashtable.clear();

        System.out.println((hashtable.isEmpty() ? "table is empty" : "table is not empty") );
    }
}
