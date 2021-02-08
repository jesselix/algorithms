package li.jesse.leetcode;

import java.util.Stack;

public class MinStack
{
    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();

    public MinStack()
    {

    }

    public void push(int x)
    {
        s1.push(x);
        if (s2.isEmpty() || s2.peek() > x)
        {
            s2.push(x);
        }
    }

    public void pop()
    {
        int x = s1.pop();
        if (x == s2.peek())
        {
            s2.pop();
        }
    }

    public int top()
    {
        return s1.peek();
    }

    public int getMin()
    {
        return s2.peek();
    }
}
