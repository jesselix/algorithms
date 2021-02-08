package li.jesse.leetcode;

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
