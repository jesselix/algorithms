package li.jesse.util;

import java.util.Iterator;
import java.util.Stack;

public class StackUtil
{
    public static void printStack(Stack<String> s)
    {
        Iterator<String> it = s.iterator();

        while (it.hasNext())
        {
            System.out.print(it.next() + ", ");
        }

        System.out.println();
    }
}
