package li.jesse.question.leetcode;

import org.junit.Test;

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
