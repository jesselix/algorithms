package li.jesse.others;

import java.util.Iterator;
import java.util.TreeSet;

public class RemoveDuplicatedNumbers {

    public static int[] removeDuplicatedNumbers(int[] arr) {
        TreeSet treeSet = new TreeSet();
        for (int i = 0; i < arr.length; i++) {
            treeSet.add(arr[i]);
        }

        int[] arr2 = new int[treeSet.size()];
        int i = 0;

        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            arr2[i] = (int)it.next();
            i++;
        }

        return arr2;
    }
}
