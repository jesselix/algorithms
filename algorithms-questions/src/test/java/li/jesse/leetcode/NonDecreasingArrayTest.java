package li.jesse.leetcode;

import org.junit.Test;

public class NonDecreasingArrayTest {

    int[] testArray1 =  {4, 2, 3};
    int[] testArray2 =  {4, 2, 1};

    @Test
    public void testNonDecreasingArray() {
        System.out.println(NonDecreasingArray.checkPossibility(testArray1));
        System.out.println(NonDecreasingArray.checkPossibility(testArray2));
    }
}
