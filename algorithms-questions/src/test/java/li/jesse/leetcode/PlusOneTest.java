package li.jesse.leetcode;

import li.jesse.volcanocommon.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class PlusOneTest {

    @Test
    public void testPlusOne() {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {9, 9, 9};

        ArrayUtil.printArray(PlusOne.plusOne(array1));
        System.out.println();
        ArrayUtil.printArray(PlusOne.plusOne(array2));
    }
}
