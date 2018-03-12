package li.jesse.question.leetcode;

/*
628. Maximum Product of Three Numbers
Easy

Given an integer array, find three numbers whose product is maximum and output the maximum product.

Example 1:
Input: [1,2,3]
Output: 6

Example 2:
Input: [1,2,3,4]
Output: 24

Note:
The length of the given array will be in range [3,10^4] and all elements are in the range [-1000, 1000].
Multiplication of any three numbers in the input won't exceed the range of 32-bit signed integer.
 */

import java.util.Arrays;

public class MaximumProductOfThreeNumbers
{
    public static int maximumProductOfThreeNumbers(int[] nums)
    {
        //对数组排序
        Arrays.sort(nums);
        int i=0;
        int j =nums.length-1;
        int count =0;
        int result = 0;
        //排序后，数组最末尾的元素小于等于0，则表示整个数组都为负值
        //那么乘积最大的三个数则在数组末尾
        if(nums[j] <=0){
            if(count <3){
                result = nums[j] * nums[j-1]*nums[j-2];
                count++;
            }
        }
        //如果数组最末尾的元素大于0，则表示整个数组可能包含正值和负值
        //除数组最末尾元素外，其他两个元素可能在数组末尾部分，可能在数组开始部分
        else{
            //数组开始部分两个数乘积
            int valueOfFront = nums[i] * nums[i+1];
            //数组末尾两个数乘积
            int valueOfBehind = nums[j-1] * nums[j-2];
            //如果开始部分的乘积大于末尾部分的乘积
            if(valueOfFront > valueOfBehind){
                result = nums[j]* valueOfFront;
            }else{
                result = nums[j] * valueOfBehind;
            }
        }
        return result;
    }
}
