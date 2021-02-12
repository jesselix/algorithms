package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDuplicatesFromSortedArray() {
        int[] array1 = {};
        int[] array2 = {1, 2, 2, 2, 3, 3, 4, 5};

        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicatesFromSortedArray(array1));
        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicatesFromSortedArray(array2));

        System.out.println();

        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicatesFromSortedArray2(array1));
        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicatesFromSortedArray2(array2));

        System.out.println();

        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicatesFromSortedArray3(array1));
        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicatesFromSortedArray3(array2));
    }

}
