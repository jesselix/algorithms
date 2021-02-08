package li.jesse.leetcode;

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
