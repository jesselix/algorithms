package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void testFindAllNumbersDisappearedInAnArray() {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(array));
    }
}
