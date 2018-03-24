package li.jesse.leetcode;

/*
414. Third Maximum Number
Easy

Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:
Input: [3, 2, 1]
Output: 1
Explanation: The third maximum is 1.

Example 2:
Input: [1, 2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: [2, 2, 3, 1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.
 */
public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        Integer max = Integer.MIN_VALUE;
        Integer mid = Integer.MIN_VALUE;
        Integer min = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                min = mid;
                mid = max;
                max = nums[i];
            } else if (nums[i] > mid && nums[i] < max) {
                min = mid;
                mid = nums[i];
            } else if (nums[i] > min && nums[i] < mid) {
                min = nums[i];
            }
        }
        return (min == Integer.MIN_VALUE || mid == min) ? max : min;
    }
}
