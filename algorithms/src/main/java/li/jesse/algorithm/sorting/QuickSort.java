package li.jesse.algorithm.sorting;

public class QuickSort
{
    private int array[];
    private int length;

    public void quickSort(int[] inputArr)
    {
        if (inputArr == null || inputArr.length == 0)
        {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSortGo(0, length - 1);
    }

    public void quickSortGo(int lowerIndex, int higherIndex)
    {
        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j)
        {
            while (array[i] < pivot)
            {
                i++;
            }
            while (array[j] > pivot)
            {
                j--;
            }
            if (i <= j)
            {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j)
        {
            quickSortGo(lowerIndex, j);
        }
        if (i < higherIndex)
        {
            quickSortGo(i, higherIndex);
        }
    }

    private void exchangeNumbers(int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}




