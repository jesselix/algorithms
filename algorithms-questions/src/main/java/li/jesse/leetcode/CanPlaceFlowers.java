package li.jesse.leetcode;

public class CanPlaceFlowers
{
    public static boolean canPlaceFlowers(int[] flowerbed, int n)
    {
        int temp = 0;
        int x = 0;

        if (n > 0)
        {
            for (int i = 0; i < flowerbed.length; i++)
            {
                if (flowerbed[i] == 0)
                {
                    temp++;
                }

                if (flowerbed[i] == 1)
                {
                    temp = 0;
                }

                if (temp % 2 == 1 && temp >= 3)
                {
                    x = (temp - 1) / 2;
                }

                if (x == n)
                    return true;
            }
        }

        return false;
    }
}
