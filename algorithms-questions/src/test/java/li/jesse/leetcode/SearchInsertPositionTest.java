package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class SearchInsertPositionTest {

    int[] array1 = {1, 3, 5, 6};
    int[] array2 = {1};

    @Test
    public void testSearchInsertPosition() {
        System.out.println(SearchInsertPosition.searchInsertPosition(array1, 5));
        System.out.println(SearchInsertPosition.searchInsertPosition(array1, 2));
        System.out.println(SearchInsertPosition.searchInsertPosition(array1, 7));
        System.out.println(SearchInsertPosition.searchInsertPosition(array1, 0));
        System.out.println(SearchInsertPosition.searchInsertPosition(array2, 0));

        System.out.println();

        System.out.println(SearchInsertPosition.searchInsertPosition2(array1, 5));
        System.out.println(SearchInsertPosition.searchInsertPosition2(array1, 2));
        System.out.println(SearchInsertPosition.searchInsertPosition2(array1, 7));
        System.out.println(SearchInsertPosition.searchInsertPosition2(array1, 0));
        System.out.println(SearchInsertPosition.searchInsertPosition2(array2, 0));
    }
}
