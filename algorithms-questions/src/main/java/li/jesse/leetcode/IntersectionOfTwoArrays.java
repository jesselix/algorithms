package li.jesse.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
349. Intersection of Two Arrays
Easy

Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
    Each element in the result must be unique.
    The result can be in any order.
 */
public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null)
            return null;
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++){
            if (set.contains(nums2[i])){
                res.add(nums2[i]);
                set.remove(nums2[i]);//!!防止add到重复的数字
            }
        }
        //遍历list成为数组返回
        int[]a = new int[res.size()];
        for (int i = 0; i < res.size(); i++){
            a[i] = (int)res.get(i);
        }

        return a;
    }
}
