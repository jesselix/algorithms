package li.jesse.test.datatype;

import li.jesse.datatype.Bit;
import org.junit.Test;

public class BitTest
{
    @Test
    public void testGetMaxInt()
    {
        // 2147483647
        System.out.println(Bit.getMaxInt());
        System.out.println(Bit.getMaxInt2());
        System.out.println(Bit.getMaxInt3());
    }

    @Test
    public void testGetMinInt()
    {
        // -2147483648
        System.out.println(Bit.getMinInt());
        System.out.println(Bit.getMinInt2());
    }

//9223372036854775807
    @Test
    public void testGetMaxLong()
    {
        // 9223372036854775807
        System.out.println(Bit.getMaxLong());
    }

    @Test
    public void testGetMinLong()
    {
        // -9223372036854775808
        System.out.println(Bit.getMinLong());
    }

    @Test
    public void testMulTwo()
    {
        System.out.println(Bit.mulTwo(3));
    }

    @Test
    public void testDivTwo()
    {
        System.out.println(Bit.divTwo(10));
    }

    @Test
    public void testMulTwoPower()
    {
        System.out.println(Bit.mulTwoPower(3, 2));
    }

    @Test
    public void testDivTwoPower()
    {
        System.out.println(Bit.divTwoPower(3, 5));
    }

    @Test
    public void testIsOddNumber()
    {
        System.out.println(Bit.isOddNumber(4));
    }

    @Test
    public void testSwap()
    {
        int x = 2;
        int y = 3;

        Bit.swap(x, y);

        System.out.println(x);
        System.out.println(y);
    }
}
//




