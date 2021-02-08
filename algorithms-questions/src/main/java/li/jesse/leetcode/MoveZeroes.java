package li.jesse.leetcode;

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
}
