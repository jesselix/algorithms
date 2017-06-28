package li.jesse.question.leetcode;

import org.junit.Test;

public class MergeSortedArrayTest
{
    @Test
    public void testMergeSortedArray()
    {
        int[] array1 = new int[10];
        array1[0] = 1;
        array1[1] = 3;

//        int[] array1 = {1, 3, 5, 7, 9};

        int[] array2 = {2, 4, 6, 8, 10};

        MergeSortedArray.mergeSortedArray(array1, 5, array2, 5);
    }
}
