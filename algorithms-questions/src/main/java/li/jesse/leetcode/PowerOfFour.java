package li.jesse.leetcode;

public class PowerOfFour
{
    public static boolean isPowerOfFour(int num)
    {
        // 0x55555555 == 0101 0101 0101 0101 0101 0101 0101 0101
        return (num & num - 1) == 0 && (num & 0x55555555) == num;
    }
}
