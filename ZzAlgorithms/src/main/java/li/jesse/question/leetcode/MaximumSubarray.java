package li.jesse.question.leetcode;

/*
# 53
Easy

 Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray
{
    public static int maximumSubarray(int[] nums)
    {
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++)
        {
            int max = nums[i];

            if (max > maxSum)
                maxSum = max;

            for (int j = i + 1; j < nums.length; j++)
            {
                if (max + nums[j] >= max)
                {
                    max = max + nums[j];

                    if (max > maxSum)
                        maxSum = max;
                }
                else
                    break;
            }
        }

        return maxSum;
    }
}
