package li.jesse.question.leetcode;

import li.jesse.util.ArrayUtil;
import org.junit.Test;

public class IntersectionOfTwoArraysTest {

    @Test
    public void testIntersectionOfTwoArrays() {
        int[] array1 = {1, 2, 2, 1};
        int[] array2 = {2, 2};

        int[] array3 = IntersectionOfTwoArrays.intersection(array1, array2);

        ArrayUtil.printArray(array3);
    }
}
