package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

public class SelfDividingNumbersTest {

    @Test
    public void testIsSelfDividingNumber() {
        System.out.println(SelfDividingNumbers.isSelfDividingNumber(10));
    }

    @Test
    public void testSelfDividingNumbers() {
        List<Integer> list = SelfDividingNumbers.selfDividingNumbers(1, 50);
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
