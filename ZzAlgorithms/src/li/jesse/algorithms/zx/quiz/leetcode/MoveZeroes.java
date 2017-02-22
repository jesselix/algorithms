package li.jesse.algorithms.zx.quiz.leetcode;

import org.junit.Test;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/

public class MoveZeroes
{
	public void moveZeroes(int[] nums)
	{
		int temp, len = nums.length;
		
		for (int i = 0; i < len; i++)
		{
			for (int j = 0; j < len - 1 - i; j++)
			{
				if (nums[j] == 0 && nums[j + 1] != 0) 
				{
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}
	}
	
	@Test
	public void testMoveZeroes()
	{
		int[] array = {77, 0, 1, 0, 3, 12};
		
		moveZeroes(array);
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}
