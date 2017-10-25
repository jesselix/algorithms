package li.jesse.util;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.SinglyLinkedList;
import org.junit.Test;

public class SinglyLinkedListUtilTest {
    @Test
    public void testSinglyLinkedListUtil() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        SinglyLinkedListUtil.addHeadNode(linkedList, 100);
        SinglyLinkedListUtil.addHeadNode(linkedList, 200);

        SinglyLinkedListUtil.insertNode(linkedList, 2, 300);

        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);

        ListNode node1 = SinglyLinkedListUtil.findByPosition(linkedList, 0);
        System.out.println(node1.getValue());
    }
}
