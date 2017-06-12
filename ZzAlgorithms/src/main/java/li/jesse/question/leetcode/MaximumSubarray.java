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
    public void maximumSubarray(int[] nums)
    {
        int maxSum = 0;

        for (int i = 0; i < nums.length - 1; i++)
        {
            int temp;
            temp = maxSum + nums[i];

            if (temp > maxSum)
            {
                maxSum = temp;
            }
        }

        System.out.println(maxSum);
    }
}
