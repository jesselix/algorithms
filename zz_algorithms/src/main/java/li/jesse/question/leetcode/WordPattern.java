package li.jesse.question.leetcode;

import java.util.HashMap;

/*
290. Word Pattern
Easy

Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
    pattern = "abba", str = "dog cat cat dog" should return true.
    pattern = "abba", str = "dog cat cat fish" should return false.
    pattern = "aaaa", str = "dog cat cat dog" should return false.
    pattern = "abba", str = "dog dog dog dog" should return false.

Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */

public class WordPattern
{
    public static boolean wordPattern(String pattern, String str)
    {
        String[] splitArray = str.split(" ");

        HashMap<Character, String> map = new HashMap<Character, String>();

        if (pattern.length() != splitArray.length) {
            return false;
        }

        char currentChar;

        for (int i = 0; i < pattern.length(); ++i) {

            currentChar = pattern.charAt(i);

            if (map.containsKey(currentChar)) {
                if (!map.get(currentChar).equals(splitArray[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(splitArray[i])) {
                    return false;
                }
                map.put(currentChar, splitArray[i]);

            }

        }

        return true;
    }
}
