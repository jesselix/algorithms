package li.jesse.question.leetcode;

/*
38. Count and Say

The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.

Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

Example 1:
Input: 1
Output: "1"

Example 2:
Input: 4
Output: "1211"
 */

public class CountAndSay
{
    public static String countAndSay(int n)
    {
        if (n == 1)
        {
            return 1 + "";
        }

        String result = "1";

        for(int i = 2; i <= n; i++)
        {
            result = say(result);
        }

        return result;
    }

    public static String say(String s)
    {
        String result = "";
        int count = 0;
        char c = '0';

        for(int i = 0; i < s.length(); i++)
        {
            c = s.charAt(i);

            if(count != 0)
            {
                if(s.charAt(i - 1) != c)
                {
                    result = result + count + s.charAt(i - 1);
                    count = 0;
                }
            }

            count++;
        }

        result = result + count + c;

        return result;
    }
}
