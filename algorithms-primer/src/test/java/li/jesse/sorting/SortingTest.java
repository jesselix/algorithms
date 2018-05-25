package li.jesse.sorting;

import li.jesse.util.ArrayUtil;
import org.junit.Test;

public class SortingTest
{
    private int[] testArray = {4, 9, 5, 8, 7, 0, 1, 3, 2, 6};
    private int[] testArray2 = {4, 9, 5, 8, 7};
    private int[] orderedTestArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    int length = testArray.length;

    @Test
    public void testBubbleSort() {
        testArray = BubbleSort.bubbleSort(testArray);
        ArrayUtil.printArray(testArray);
    }

    @Test
    public void testBubbleSortWithSwappedFlag() {
        testArray = BubbleSort.bubbleSortWithSwappedFlag(testArray);
        ArrayUtil.printArray(testArray);
        System.out.println("\n");
        testArray = BubbleSort.bubbleSortWithSwappedFlag(orderedTestArray);
        ArrayUtil.printArray(orderedTestArray);
    }

    @Test
    public void testCocktailShakerSort() {
        testArray = CocktailShakerSort.cocktailShakerSort(testArray);

        System.out.println();
        ArrayUtil.printArray(testArray);
    }

    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(testArray);
//        for (int i : numbers)
//        {
//            System.out.print(i + " ");
//        }

        ArrayUtil.printArray(testArray);
    }

    @Test
    public void testSelectionSort() {
        SelectionSort.selectionSort(testArray);
        ArrayUtil.printArray(testArray);
    }

}




