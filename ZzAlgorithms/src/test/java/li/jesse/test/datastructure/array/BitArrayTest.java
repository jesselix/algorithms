package li.jesse.test.datastructure.array;

import li.jesse.datastructure.array.BitArray;
import org.junit.Test;

public class BitArrayTest
{
    @Test
    public void testGetMaxInt()
    {
        // 2147483647
        System.out.println(BitArray.getMaxInt());
        System.out.println(BitArray.getMaxInt2());
        System.out.println(BitArray.getMaxInt3());
    }

    @Test
    public void testGetMinInt()
    {
        // -2147483648
        System.out.println(BitArray.getMinInt());
        System.out.println(BitArray.getMinInt2());
    }

    //9223372036854775807
    @Test
    public void testGetMaxLong()
    {
        // 9223372036854775807
        System.out.println(BitArray.getMaxLong());
    }

    @Test
    public void testGetMinLong()
    {
        // -9223372036854775808
        System.out.println(BitArray.getMinLong());
    }

    @Test
    public void testMulTwo()
    {
        System.out.println(BitArray.mulTwo(3));
    }

    @Test
    public void testDivTwo()
    {
        System.out.println(BitArray.divTwo(10));
    }

    @Test
    public void testMulTwoPower()
    {
        System.out.println(BitArray.mulTwoPower(3, 2));
    }

    @Test
    public void testDivTwoPower()
    {
        System.out.println(BitArray.divTwoPower(3, 5));
    }

    @Test
    public void testIsOddNumber()
    {
        System.out.println(BitArray.isOddNumber(4));
    }

    @Test
    public void testSwap()
    {
        int x = 2;
        int y = 3;

        BitArray.swap(x, y);

        System.out.println(x);
        System.out.println(y);
    }
}
