package li.jesse.searching;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(BinarySearch.binarySearch(3, array));
        System.out.println(BinarySearch.binarySearch(7, array));
    }
}
