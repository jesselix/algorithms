package li.jesse.leetcode;

public class MaximumSubarray
{
    public static int maximumSubarray(int[] nums) {
        int maxSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];

            if (max > maxSum)
                maxSum = max;

            for (int j = i + 1; j < nums.length; j++) {
                if (max + nums[j] >= max) {
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
