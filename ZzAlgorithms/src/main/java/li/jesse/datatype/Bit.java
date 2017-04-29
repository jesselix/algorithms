package li.jesse.datatype;

public class Bit
{
    // get maximum value of int
    public static int getMaxInt()
    {
        return (1 << 31) - 1;
    }

    public static int getMaxInt2()
    {
        return ~(1 << 31);
    }

    public static int getMaxInt3()
    {
        return (1 << -1) - 1;
    }

    // get minimum value of int
    public static int getMinInt()
    {
        return 1 << 31;
    }

    public static int getMinInt2()
    {
        return 1 << -1;
    }

    // get maximum value of long
    public static long getMaxLong()
    {
        return ((long)1 << 127) - 1;
    }

    // get minimum value of long
    public static long getMinLong()
    {
        return (long)1 << 127;
    }

    // n multiplied by 2
    public static int mulTwo(int n)
    {
        return n << 1;
    }

    // n divided by 2
    public static int divTwo(int n)
    {
        return n >> 1;
    }

    // n multiplied by m power of 2
    public static int mulTwoPower(int n, int m)
    {
        return n << m;
    }

    // n divided by m power of 2
    public static int divTwoPower(int n, int m)
    {
        return n >> m;
    }

    // odd or even
    public static boolean isOddNumber(int n)
    {
        return (n & 1) == 1;
    }

    public static void swap(int a, int b)
    {
        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println(a);
        System.out.println(b);
    }
}
