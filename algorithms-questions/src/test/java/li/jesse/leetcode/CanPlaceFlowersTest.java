package li.jesse.leetcode;

import org.junit.Test;

public class CanPlaceFlowersTest
{
    int[] testArray =  {0, 1, 0, 0, 0, 0, 0, 1};

    @Test
    public void testCanPlaceFlowers()
    {
        boolean y = CanPlaceFlowers.canPlaceFlowers(testArray, 3);

        System.out.print(y);
    }
}
