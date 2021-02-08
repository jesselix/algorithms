package li.jesse.leetcode;

public class FindTheDifference
{
    public static char findTheDifference(String s, String t)
    {
        for (int i = 0; i < t.length(); i++)
        {
            if (s.charAt(i) != t.charAt(i))
            {
                return t.charAt(i);
            }
        }

        return ' ';
    }

    public static char findTheDifference2(String s, String t)
    {
        char temp = 0;
        for(int i = 0; i < s.length(); i++)
        {
            temp = (char) (temp ^ s.charAt(i));
            System.out.print(temp);
        }

        for(int j = 0; j < t.length(); j++)
        {
            temp = (char) (temp ^ t.charAt(j));
            System.out.print(temp);
        }

        return 'w';
    }
}
