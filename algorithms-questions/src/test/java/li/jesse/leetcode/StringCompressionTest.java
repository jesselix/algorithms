package li.jesse.leetcode;

import org.junit.Test;

public class StringCompressionTest {

    @Test
    public void testStringCompression() {

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
//        char[] chars2 = {'a'};
        System.out.println(StringCompression.compress(chars));
//        System.out.println(StringCompression.compress(chars2));
    }
}
