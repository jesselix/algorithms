package li.jesse.sorting;

import org.junit.Test;

public class YyTest
{
	int[] number = {95, 45, 15, 78, 84, 51, 24, 12};
	
	@Test
	public void test_bubble()
	{
		number = BubbleSort.bubble_sort(number);
		for(int i = 0; i < number.length; i++) 
			System.out.print(number[i] + " ");
		System.out.println();
	}
}
