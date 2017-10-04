package li.jesse.question.leetcode;

/*
232. Implement Queue using Stacks
Easy

Implement the following operations of a queue using stacks.
    push(x) -- Push element x to the back of queue.
    pop() -- Removes the element from in front of queue.
    peek() -- Get the front element.
    empty() -- Return whether the queue is empty.

Notes:
    You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
    Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
    You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 */

import java.util.Stack;

public class ImplementQueueUsingStacks
{
    // Push element x to the back of queue.
    static Stack<Integer> stack=new Stack<>();
    static Stack<Integer> stack2=new Stack<>();

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
