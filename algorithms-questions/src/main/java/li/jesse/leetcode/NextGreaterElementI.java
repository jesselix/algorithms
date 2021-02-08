package li.jesse.leetcode;

public class NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int output[] = new int[nums1.length];
        int mark = 0;
        boolean flag = false;

        for (int i = 0; i < output.length; i++) {
            output[i] = -1;
        }

        for (int i = 0; i < nums1.length; i++) {
            flag = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    mark = nums1[i];
                    System.out.println("ddd " + i + " " + j + " " + mark);
                    flag = true;
                    continue;
                }
                if (flag == true && nums2[j] > mark) {
                    output[i] = nums2[j];
                    break;
                }
            }
        }

        return output;
    }
}
