package li.jesse.algorithms.sorting;

import org.junit.Test;

public class SortingTest
{
	int[] number = {95, 45, 15, 78, 84, 51, 24, 12};
	
	@Test
	public void testBubbleSort()
	{
		number = BubbleSort.bubbleSort(number);
		for(int i = 0; i < number.length; i++)
		{
			System.out.print(number[i] + " ");
		}
		
		System.out.println();
	}
}