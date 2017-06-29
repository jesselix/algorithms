package li.jesse.question.leetcode;

import org.junit.Test;

public class MaxConsecutiveOnesTest
{
    int[] testArray =  {0, 1, 0, 0, 0, 1, 1, 1};

    @Test
    public void testMaxConsecutiveOnes()
    {
        int result = MaxConsecutiveOnes.maxConsecutiveOnes(testArray);

        System.out.println(result);
    }
}
