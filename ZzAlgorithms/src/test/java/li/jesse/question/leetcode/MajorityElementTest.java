package li.jesse.question.leetcode;

import org.junit.Test;

public class MajorityElementTest
{
    @Test
    public void testMajorityElement()
    {
        int[] array = {1, 1, 2, 1, 2, 2, 2};

        System.out.println(MajorityElement.majorityElement(array));
    }
}
