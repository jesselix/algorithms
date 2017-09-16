package li.jesse.util;

public class NumeralSystemUtil
{
    public static void BinaryToDecimal(String s)
    {
//        Integer.parseInt("10002", 2);

    }

    public static int lengthOfNumber(int x)
    {
        int div = 1;
        int length = 1;

        while (x / div >= 10)
        {
            div *= 10;
            length++;
        }

        return length;
    }
}
