package li.jesse.leetcode;

public class CountPrimes
{
    public static int countPrimes(int n)
    {
        int sum = 1;
        boolean flag = false;

        for (int i = 2; i < n; i++)
        {
            flag = false;

            for (int j = 2; j <= i; j++)
            {
                if (j == i)
                    break;

                if (i % j == 0)
                {
                    flag = false;
                    break;
                }

                flag = true;
            }

            if (flag == true)
                sum++;
        }

        return sum;
    }
}
