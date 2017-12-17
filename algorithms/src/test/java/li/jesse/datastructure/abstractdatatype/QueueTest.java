package li.jesse.datastructure.abstractdatatype;

import li.jesse.datastructure.list.linkedlist.LinkedListAsQueue;
import org.junit.Test;

public class QueueTest
{
    @Test
    public void testLinkedListAsQueue()
    {
        LinkedListAsQueue queue = new LinkedListAsQueue();

        for (int i = 0; i < 10; i++)
        {
            queue.put(i);
        }

        queue.print();
        System.out.println();

        queue.get();
        queue.get();

        queue.print();
    }
}
