package li.jesse.algorithm.sorting;

import li.jesse.common.ArrayUtil;

public class SelectionSort
{
    public static void selectionSort(int[] array)
    {
        if (array == null || array.length < 2)
        {
            return;
        }

        for (int i = array.length - 1; i > 0; i--)
        {
            int maxIndex = i;
            for (int j = i - 1; j >= 0; j--)
            {
                if (array[j] > array[maxIndex])
                {
                    maxIndex = j;
                }
            }

            if (maxIndex != i)
            {
                ArrayUtil.swap(array, i, maxIndex);
            }
        }
    }
}
