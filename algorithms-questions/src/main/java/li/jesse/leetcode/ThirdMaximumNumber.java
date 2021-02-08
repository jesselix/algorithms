package li.jesse.leetcode;

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
