package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class WordPatternTest
{
    @Test
    public void testWordPattern()
    {
        String pattern1 = "abba";
        String string1 = "dog cat cat dog";

        String pattern2 = "abcde";
        String string2 = "apple orange banana kiwifruit tomato";

        String pattern3 = "abba";
        String string3 = "dog cat cat cat";

        System.out.println(WordPattern.wordPattern(pattern1, string1));
        System.out.println(WordPattern.wordPattern(pattern2, string2));
        System.out.println(WordPattern.wordPattern(pattern3, string3));
    }
}
