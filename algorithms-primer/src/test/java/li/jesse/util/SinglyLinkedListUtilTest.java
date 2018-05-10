package li.jesse.util;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.singly.SinglyLinkedList;
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

    @Test
    public void testBuildSinglyLinkedListFromIntArray() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        int[] array = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        linkedList = SinglyLinkedListUtil.buildSinglyLinkedListFromIntArray(array);
        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);
    }

    @Test
    public void testBuildSinglyLinkedListFromListNodeArrayWithNullNext() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode[] array = {node1, node2, node3, node4};

        SinglyLinkedList linkedList = SinglyLinkedListUtil.buildSinglyLinkedListFromListNodeArrayWithNullNext(array);

        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);
    }
}
