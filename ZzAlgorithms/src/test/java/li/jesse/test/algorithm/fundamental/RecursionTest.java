package li.jesse.test.algorithm.fundamental;

import li.jesse.algorithm.fundamental.Recursion;
import org.junit.Test;

public class RecursionTest
{
    @Test
    public void testHanoi()
    {
        Recursion.hanoiMoveDish(3, 'A', 'B', 'C');
    }

    @Test
    public void testFibonacci()
    {
        int j = 15;
        System.out.println();
        System.out.println("斐波那契数列的前" + j + "项为：");
        for (int i = 1; i <= j; i++) {
            System.out.print(Recursion.fibonacci(i) + "\t");
            if (i % 5 == 0)
                System.out.println();
        }
    }
}
