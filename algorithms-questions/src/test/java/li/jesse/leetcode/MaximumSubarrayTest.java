package li.jesse.leetcode;

import org.junit.Test;

public class MaximumSubarrayTest
{
    private int[] testArray =  {-9, 9, 1, 3, -50, 1};

    @Test
    public void testMaximumSubarray()
    {
        int result = MaximumSubarray.maximumSubarray(testArray);

        System.out.println(result);
    }
}
