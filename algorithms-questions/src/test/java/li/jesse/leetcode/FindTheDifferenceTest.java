package li.jesse.leetcode;

import org.junit.Test;

public class FindTheDifferenceTest
{
    @Test
    public void testFindTheDifference()
    {
        String x = "abcd";
        String y = "abcBd";

        System.out.println(FindTheDifference.findTheDifference(x, y));
        System.out.println(FindTheDifference.findTheDifference2(x, y));
    }
}
