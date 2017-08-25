package li.jesse.datatype.composite;

import org.junit.Test;

public class MyStringTest
{
    private String str = "this is str";


    @Test
    public void testLenAndCap()
    {
        int len = str.length();
//        int cap =

        System.out.println(len);
    }

    @Test
    public void testIndex()
    {
        int index1 = str.indexOf("i");
        int index2 = str.indexOf('i', index1 + 1);

        System.out.println(index1);
        System.out.println(index2);
    }
}
