package li.jesse.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {

            if (SelfDividingNumbers.isSelfDividingNumber(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static boolean isSelfDividingNumber(int number) {
        int quotient;
        int number2 = number;
        do {
            int mod = number2 % 10;
            quotient = number2 / 10;

            if (mod == 0) {
                return false;
            }
            if (number2 % mod == 0) {
                number2 = quotient;
            } else {
                return false;
            }
        } while (quotient != 0);

        return true;
    }
}
