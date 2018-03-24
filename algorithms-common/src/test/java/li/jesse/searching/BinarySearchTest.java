package li.jesse.searching;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] array = {1, 2, 3, 4, 4, 4, 5};

        System.out.println(BinarySearch.binarySearch(array, 1));
//        System.out.println(BinarySearch.findFirstElementEqualToKey(array, 4));
//        System.out.println(BinarySearch.findLastElementEqualToKey(array, 4));
    }

    @Test
    public void testFindElement() {
        int[] array = {1, 2, 3, 4, 4, 4, 5};

        System.out.println(BinarySearch.findElement(array, 4, BinarySearch.FirstLast.LAST, BinarySearch.Operation.EQUAL));
    }
}
