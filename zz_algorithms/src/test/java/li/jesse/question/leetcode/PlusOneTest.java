package li.jesse.question.leetcode;

import li.jesse.util.ArrayUtil;
import org.junit.Test;

public class PlusOneTest
{
    @Test
    public void testPlusOne()
    {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {9, 9, 9, 9, 9};

        ArrayUtil.printArray(PlusOne.plusOne(array1));
        System.out.println();
        ArrayUtil.printArray(PlusOne.plusOne(array2));
        System.out.println();
    }
}
