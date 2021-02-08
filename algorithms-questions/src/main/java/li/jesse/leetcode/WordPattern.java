package li.jesse.leetcode;

import java.util.HashMap;

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
