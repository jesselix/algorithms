package li.jesse.leetcode;

public class MaxConsecutiveOnes
{
    public static int maxConsecutiveOnes(int[] nums)
    {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                if (count > 0)
                {
                    count = 0;
                }

                continue;
            }

            if (nums[i] == 1)
            {
                count++;

                if (maxCount < count)
                {
                    maxCount = count;
                }
            }
        }

        return maxCount;
    }
}
