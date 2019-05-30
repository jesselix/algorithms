package li.jesse.others;

import org.junit.Test;

public class RemoveDuplicatedNumbersTest {

    @Test
    public void testRemoveDuplicatedNumbers() {
        int [] arr = {9, 2, 3, 4, 5, 6, 7, 8, 2, 3, 4};
        int[] arr2 = RemoveDuplicatedNumbers.removeDuplicatedNumbers(arr);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
