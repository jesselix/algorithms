package li.jesse.leetcode;

public class BinaryNumberWithAlternatingBits {
    public static boolean hasAlternatingBits(int n) {
        int bit = -1;
        while (n > 0) {
            int x = n & 1;
            if (x == 1) {
                if (bit == 1) return false;
                bit = 1;
            } else {
                if (bit == 0) return false;
                bit = 0;
            }
            n >>= 1;
        }
        return true;
    }
}
