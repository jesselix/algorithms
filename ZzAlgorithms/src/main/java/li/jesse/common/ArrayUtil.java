package li.jesse.common;

public class ArrayUtil
{
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);

            if (i < array.length - 1)
            {
                System.out.print(" ");
            }
        }
    }

    public static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}




