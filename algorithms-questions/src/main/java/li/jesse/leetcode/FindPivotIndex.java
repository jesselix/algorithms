package li.jesse.leetcode;

public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        if (nums.length != 1 && nums.length != 2) {
            int sum1 = nums[0];
            int sum2 = 0;
            for (int i = 2; i < nums.length; i++) {
                sum2 += nums[i];
            }

            if (sum1 == sum2) {
                return 1;
            }

            for (int i = 2; i < nums.length - 1; i++) {
                sum1 += nums[i - 1];
                sum2 -= nums[i];

                if (sum1 == sum2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int pivotIndex2(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int j = 1; j < nums.length; j++) {
            sum1 += nums[j - 1];
            if (sum1 == (sum - nums[j]) * 0.5) {
                return j;
            }
        }
        return -1;
    }
}
