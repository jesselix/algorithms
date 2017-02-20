package li.jesse.algorithm.sorting;

public class BubbleSort
{
	public static int[] bubbleSort(int[] arr) 
	{
		int i, j, temp, len = arr.length;
		
		for (i = 0; i < len - 1; i++)
		{
			for (j = 0; j < len - 1 - i; j++)
			{
				if (arr[j] > arr[j + 1]) 
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		return arr;
	}
}
