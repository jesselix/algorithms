package li.jesse.question.leetcode;

import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void testBestTimeToBuyAndSellStock() {
        int[] array1 = {7, 1, 5, 3, 6, 4};
        int[] array2 = {7, 6, 4, 3, 1};

        System.out.println(BestTimeToBuyAndSellStock.maxProfit(array1));
        System.out.println(BestTimeToBuyAndSellStock.maxProfit(array2));
    }
}
