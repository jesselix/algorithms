package li.jesse.leetcode;

import org.junit.Test;

public class FindPivotIndexTest {

    @Test
    public void testFindPivotIndex() {
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {2, 3};
        int[] nums4 = {4};
        System.out.println(FindPivotIndex.pivotIndex(nums1));
        System.out.println(FindPivotIndex.pivotIndex(nums2));
        System.out.println(FindPivotIndex.pivotIndex(nums3));
        System.out.println(FindPivotIndex.pivotIndex(nums4));
        System.out.println();
        System.out.println(FindPivotIndex.pivotIndex2(nums1));
        System.out.println(FindPivotIndex.pivotIndex2(nums2));
        System.out.println(FindPivotIndex.pivotIndex2(nums3));
        System.out.println(FindPivotIndex.pivotIndex2(nums4));
    }
}
