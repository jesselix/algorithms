package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class ValidParenthesesTest
{
    private String str = "[][])";

    @Test
    public void testValidParentheses()
    {
        boolean y = ValidParentheses.validParentheses(str);

        System.out.println(y);
    }
}
