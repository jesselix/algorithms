package li.jesse.leetcode;

/*
168. Excel Sheet Column Title
Easy

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:
    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
 */

public class ExcelSheetColumnTitle
{
    public static String convertToTitle(int n)
    {
        String ret = "";

        while(n > 0)
        {
            ret = (char)((n - 1) % 26 + 'A') + ret;
            n = (n - 1) / 26;
        }
        return ret;
    }

    public static String convertToTitle2(int n)
    {
        if(n <= 0){
            throw new IllegalArgumentException("Input is not valid!");
        }

        StringBuilder sb = new StringBuilder();

        while(n > 0){
            n--;
            char ch = (char) (n % 26 + 'A');
            n /= 26;
            sb.append(ch);
        }

        sb.reverse();
        return sb.toString();
    }
}
