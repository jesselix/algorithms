package li.jesse.leetcode;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
            }
        }

        if (digits[0] != 0) {
            return digits;
        } else {
            int[] nums = new int[digits.length + 1];
            nums[0] = 1;
            for (int i = 1; i < nums.length; i++) {
                nums[i] = 0;
            }
            return nums;
        }
    }


}
