package li.jesse.question.leetcode;

import org.junit.Test;

public class FindAllNumbersDisappearedInAnArrayTest {

    @Test
    public void testFindAllNumbersDisappearedInAnArray() {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(FindAllNumbersDisappearedInAnArray.findDisappearedNumbers(array));
    }
}
