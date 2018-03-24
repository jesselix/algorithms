package li.jesse.datastructure.abstractdatatype;

import li.jesse.datastructure.list.linkedlist.LinkedListAsStack;
import org.junit.Test;

public class StackTest
{
    @Test
    public void testLinkedListAsStack()
    {
        LinkedListAsStack stack = new LinkedListAsStack();

        for (int i = 0; i < 10; i++)
        {
            stack.push(i);
        }

        stack.printFromTopToBottom();
        System.out.println();

        stack.pop();
        stack.pop();

        stack.printFromTopToBottom();
    }
}
