package li.jesse.question.leetcode;

import org.junit.Test;

public class ThirdMaximumNumberTest {

    @Test
    public void testThirdMaximumNumber() {
        int[] array0 = {3, 2, 1};
        int[] array1 = {1, 2};
        int[] array2 = {2, 2, 3, 1};
        System.out.println(ThirdMaximumNumber.thirdMax(array0));
        System.out.println(ThirdMaximumNumber.thirdMax(array1));
        System.out.println(ThirdMaximumNumber.thirdMax(array2));
    }
}
