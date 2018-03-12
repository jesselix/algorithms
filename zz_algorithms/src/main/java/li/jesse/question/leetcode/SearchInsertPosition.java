package li.jesse.question.leetcode;

/*
#35 Search Insert Position
Easy

Given a sorted array and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */

public class SearchInsertPosition
{
	public int searchInsertPosition(int[] nums, int target)
	{
		for(int i = 0; i < nums.length; i++)
		{
			if (target <= nums[i])
			{
				return i;
			}
			else
			{
				if (i == nums.length - 1)
				{
					return nums.length;
				}
			}
		}
		
		return 0;
	}
}
