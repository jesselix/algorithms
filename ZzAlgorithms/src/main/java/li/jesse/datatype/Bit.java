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

//        System.out.println(a);
//        System.out.println(b);
    }

    // absolute
    // more effective than n>0  ?  n:-n in some machines
    public static int abs(int n)
    {
        return (n ^ (n >> 31)) - (n >> 31);
    }

    // bigger number
    // more effective than a>b ? a:b in some machines
    public static int max(int a, int b)
    {
        return b & ((a-b) >> 31) | a & (~(a-b) >> 31);
    }

    // smaller number
    // more effective than a>b ? b:a in some machines
    public static int min(int a, int b)
    {
        return a & ((a-b) >> 31) | b & (~(a-b) >> 31);
    }

    // is sam sign
    public static boolean isSameSign(int x, int y)
    {
        return (x ^ y) >= 0;
    }


    // is factorial of 2
    public static boolean isFactorialofTwo(int n)
    {
        return n > 0 ? (n & (n - 1)) == 0 : false;
    }

    // take remainder of power n of 2
    public static int remainder(int m,int n)
    {
        return m & (n - 1);
    }

    // average of two numbers
    public static int getAverage(int x, int y)
    {
        return (x + y) >> 1;
    }

    public static int getAverage2(int x, int y)
    {
        return ((x ^ y) >> 1) + (x & y);
    }

    // from low bit to high bit, get bit of position m of number n
    public static int getBit(int n, int m)
    {
        return (n >> (m-1)) & 1;
    }

    // from low bit to high bit, set bit of position m of number n to 1
    public static int setBitToOne(int n, int m)
    {
        return n | (1 << (m-1));
    }

    // from low bit to high bit, set bit of position m of number n to 0
    public static int setBitToZero(int n, int m)
    {
        return n & ~(1 << (m-1));
    }

    // n + 1
    public static int plusOne(int n)
    {
        return -~n;
    }

    // n - 1
    public static int minusOne(int n)
    {
        return ~-n;
    }

    public static int oppositeNumber(int n)
    {
        return  ~n + 1;
    }

    public static int oppositeNumber2(int n)
    {
        return (n ^ -1) + 1;
    }

    // if(x == a) x = b; if(x == b) x = a;
    public static int abx(int a, int b, int x)
    {
        x = a ^ b ^ x;

        return x;
    }
}



