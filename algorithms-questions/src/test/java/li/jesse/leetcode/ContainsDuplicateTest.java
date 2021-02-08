package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class ContainsDuplicateTest {

    private int[] testArray =  {1, 2, 3, 4, 5, 4};

    @Test
    public void testContainsDuplicate()
    {
        boolean b = ContainsDuplicate.containsDuplicate(testArray);

        System.out.println(b);
    }
}
