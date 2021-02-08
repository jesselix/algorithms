package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class IsomorphicStringsTest {

    @Test
    public void testIsomorphicStrings() {
        String s1 = "egg";
        String t1 = "all";

        String s2 = "abc";
        String t2 = "def";

        String s3 = "gogo";
        String t3 = "gogogo";

        System.out.println(IsomorphicStrings.isomorphicStrings(s1, t1));
        System.out.println(IsomorphicStrings.isomorphicStrings(s2, t2));
        System.out.println(IsomorphicStrings.isomorphicStrings(s3, t3));
    }
}
