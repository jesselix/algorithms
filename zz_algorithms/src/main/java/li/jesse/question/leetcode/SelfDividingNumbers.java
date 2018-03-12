package li.jesse.question.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
728. Self Dividing Numbers
Easy

A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

Note:
The boundaries of each input argument are 1 <= left <= right <= 10000.
 */
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
