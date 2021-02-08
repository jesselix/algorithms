package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class RemoveElementTest
{
    @Test
    public void testRemoveElement()
    {
        int[] array = {1, 1, 2, 3, 4, 1, 5};

        System.out.println(RemoveElement.removeElement(array, 1));
    }
}
