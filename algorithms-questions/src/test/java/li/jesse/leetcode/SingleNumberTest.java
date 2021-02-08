package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class SingleNumberTest
{
    @Test
    public void testSingleNumber()
    {
        int[] array = {1, 2, 1, 5, 4, 2, 6, 6, 5};

        System.out.println(SingleNumber.singleNumber(array));
    }
}
