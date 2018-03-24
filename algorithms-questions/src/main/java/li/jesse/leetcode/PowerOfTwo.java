package li.jesse.leetcode;

/*
231. Power of Two
Easy

Given an integer, write a function to determine if it is a power of two.
 */

public class PowerOfTwo
{
    public static boolean isPowerOfTwo(int n)
    {
        return n > 0 && ((n & (n - 1)) == 0 );
    }
}
