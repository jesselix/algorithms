package li.jesse.leetcode;

import java.util.Stack;

/*
#155 Min Stack
Easy

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
    push(x) -- Push element x onto stack.
    pop() -- Removes the element on top of the stack.
    top() -- Get the top element.
    getMin() -- Retrieve the minimum element in the stack.

Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
 */

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
