package li.jesse.leetcode;

import org.junit.jupiter.api.Test;

public class MinStackTest
{
    @Test
    public void testMinStack()
    {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        minStack.push(1);

        System.out.println(minStack.top());

        minStack.pop();
        System.out.println(minStack.getMin());
    }
}
