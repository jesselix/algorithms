package li.jesse.question.leetcode;

/*
169. Majority Element
Easy

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.
 */

public class MajorityElement
{
    public static int majorityElement(int[] nums)
    {
        int n = nums.length;
        int ans = 0;
        for (int i = 31; i >= 0 ; i --) {
            int cnt0 = 0;
            for (int j = 0; j < n; j ++) {
                if ((nums[j] & (1 << i)) == 0) {
                    cnt0 ++;
                }
            }
            ans <<= 1;
            ans += (cnt0 > (n >> 1)) ? 0 : 1;
        }
        return ans;
    }
}
