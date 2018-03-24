package li.jesse.leetcode;

import org.junit.Test;

public class ContainsDuplicateIITest
{
    private int[] testArray =  {1, 2, 3, 4, 5, 1};

    @Test
    public void testContainsDuplicateII()
    {
        boolean b = ContainsDuplicateII.containsDuplicateII(testArray, 2);

        System.out.println(b);
    }
}
