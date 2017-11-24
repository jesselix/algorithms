package li.jesse.datastructure.javas.collection.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListTest {

    @Test
    public void arrayListAddElements() {
        List list = new ArrayList();

        for (int i = 0; i < 100000; i++) {
            list.add(String.valueOf(i));
        }

        isRandomAccessSupported(list);

        traverseThroughRandomAccess(list);
        traverseThroughFor2(list);
        traverseThroughIterator(list);
    }

    private static void isRandomAccessSupported(List list) {
        if (list instanceof RandomAccess) {
            System.out.println("RandomAccess implemented!");
        } else {
            System.out.println("RandomAccess not implemented!");
        }
    }

    public static void traverseThroughRandomAccess(List list) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iterator Through Random Access：" + interval + " ms");
    }

    public static void traverseThroughFor2(List list) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();

        for (Object object : list) {

        }

        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iterator Through For 2：" + interval + " ms");
    }

    public static void traverseThroughIterator(List list) {
        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();
        for(Iterator iter = list.iterator(); iter.hasNext(); ) {
            iter.next();
        }
        endTime = System.currentTimeMillis();
        long interval = endTime - startTime;
        System.out.println("iterator Through Iterator：" + interval + " ms");
    }

}
