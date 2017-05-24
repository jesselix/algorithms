package li.jesse.test.algorithm.sorting;

import li.jesse.algorithm.sorting.BubbleSort;
import li.jesse.algorithm.sorting.QuickSort;
import org.junit.Test;

public class SortingTest
{
    int[] numbers = {95, 45, 15, 78, 84, 51, 24, 12};
    int length = numbers.length;

    @Test
    public void testBubbleSort()
    {
        numbers = BubbleSort.bubbleSort(numbers);

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }

    @Test
    public void testQuickSort()
    {
        QuickSort quickSort = new QuickSort();
        quickSort.myQuickSort(numbers);
        for (int i : numbers)
        {
            System.out.print(i + " ");
        }
    }

}




