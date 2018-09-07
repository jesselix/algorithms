package li.jesse.recursion;

import org.junit.Test;

public class DivideAndConquerTest {

    @Test
    public void testHanoi() {
        DivideAndConquer.hanoi(3, 'A', 'B', 'C');
    }

    @Test
    public void testFibonacci() {
        int j = 15;
        System.out.println();
        System.out.println("the first " + j + " fibonacci numbers are: ");

        for (int i = 1; i <= j; i++) {
            System.out.print(DivideAndConquer.fibonacci(i) + "\t");

            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }

}
