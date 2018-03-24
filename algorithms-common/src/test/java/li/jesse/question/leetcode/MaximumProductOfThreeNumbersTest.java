package li.jesse.question.leetcode;

import org.junit.Test;

public class MaximumProductOfThreeNumbersTest
{
    @Test
    public void testMaximumProductOfThreeNumbers()
    {
        int[] array1 = {2, 3, 4, 5, 6};
        int[] array2 = {-20, -30, 4, 5, 6};

        System.out.println(MaximumProductOfThreeNumbers.maximumProductOfThreeNumbers(array1));
        System.out.println(MaximumProductOfThreeNumbers.maximumProductOfThreeNumbers(array2));
    }
}
