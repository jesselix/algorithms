package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class NextGreaterElementITest {

    @Test
    public void testNextGreaterElementI() {
        int input1[] = {4, 1, 2};
        int input2[] = {1, 3, 4, 2};
        int output[] = new int[input1.length];

        output = NextGreaterElementI.nextGreaterElement(input1, input2);

        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
