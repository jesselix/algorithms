package li.jesse.question.leetcode;

import org.junit.Test;

public class AssignCookiesTest {
    @Test
    public void testAssignCookies() {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(AssignCookies.findContentChildren(g, s));

        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println(AssignCookies.findContentChildren(g2, s2));
    }
}
