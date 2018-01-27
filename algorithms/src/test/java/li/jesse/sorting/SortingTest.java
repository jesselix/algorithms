package li.jesse.sorting;

import li.jesse.sorting.BubbleSort;
import li.jesse.sorting.QuickSort;
import li.jesse.sorting.SelectionSort;
import li.jesse.util.ArrayUtil;
import org.junit.Test;

public class SortingTest
{
    int[] numbers = {4, 9, 5, 8, 7, 0, 1, 3, 2, 6};
    int length = numbers.length;

    @Test
    public void testBubbleSort()
    {
        numbers = BubbleSort.bubbleSort(numbers);

        ArrayUtil.printArray(numbers);
    }

    @Test
    public void testQuickSort()
    {
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(numbers);
//        for (int i : numbers)
//        {
//            System.out.print(i + " ");
//        }

        ArrayUtil.printArray(numbers);
    }

    @Test
    public void testSelectionSort()
    {
        SelectionSort.selectionSort(numbers);
        ArrayUtil.printArray(numbers);
    }

}




