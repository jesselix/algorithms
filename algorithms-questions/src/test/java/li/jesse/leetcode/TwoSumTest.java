package li.jesse.leetcode;

import li.jesse.volcanocommon.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        int[] array1 = {2, 7, 11, 15};
        int[] array2 = {3, 2, 4};
        int[] array3 = {3, 3};

        ArrayUtil.printArray(TwoSum.twoSum(array1, 9));
        System.out.println();
        ArrayUtil.printArray(TwoSum.twoSum2(array1, 9));
        System.out.println();
        ArrayUtil.printArray(TwoSum.twoSum3(array1, 9));
        System.out.println();
    }
}
