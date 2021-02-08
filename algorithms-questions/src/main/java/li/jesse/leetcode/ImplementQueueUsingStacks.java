package li.jesse.leetcode;

import java.util.Stack;

public class ImplementQueueUsingStacks
{
    // Push element x to the back of queue.
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void push(int x)
    {
        while(!stack.isEmpty())
        {
            stack2.push(stack.pop());
        }
        stack2.push(x);
        while(!stack2.isEmpty())
        {
            stack.push(stack2.pop());
        }
    }

    // Removes the element from in front of queue.
    public static void pop() {
        stack.pop();
    }

    // Get the front element.
    public static int peek() {
        System.out.println(stack.peek());
        return stack.peek();
    }

    // Return whether the queue is empty.
    public static boolean empty() {
        System.out.println(stack.isEmpty());
        return stack.isEmpty();
    }
}
