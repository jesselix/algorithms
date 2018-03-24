package li.jesse.leetcode;

/*
#219 Contains Duplicate II
Easy

Given an array of integers and an integer k,
find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
and the absolute difference between i and j is at most k.
 */

public class ContainsDuplicateII
{
    public static boolean containsDuplicateII(int[] nums, int k)
    {
        for (int i = 0; i < nums.length - 1; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k)
                {
                    return true;
                }
            }
        }

        return false;
    }
}
