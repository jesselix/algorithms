package li.jesse.question.leetcode;

/*
125. Valid Palindrome
Easy

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.
For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome
{
    public static boolean isPalindrome(String s)
    {
        if (s.length() == 0)
            return true;

        s = s.toUpperCase();
        int low1 = 'A', high1 = 'Z';
        int low2 = '0', high2 = '9';
        int low = 0, high = s.length()-1;

        while (low < high)
        {
            if ((s.charAt(low) < low1 || s.charAt(low) > high1) && (s.charAt(low)<low2||s.charAt(low)>high2))
            {
                low++;
                continue;
            }

            if ((s.charAt(high) < low1 || s.charAt(high) > high1) && (s.charAt(high) < low2 || s.charAt(high) > high2))
            {
                high--;
                continue;
            }

            if (s.charAt(low) == s.charAt(high))
            {
                low++;
                high--;
            }
            else
                return false;
        }
        return true;
    }
}
