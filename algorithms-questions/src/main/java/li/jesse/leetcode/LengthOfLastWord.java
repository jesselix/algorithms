package li.jesse.leetcode;

public class LengthOfLastWord
{
    public static int lengthOfLastWord(String s)
    {
        return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
    }
}
