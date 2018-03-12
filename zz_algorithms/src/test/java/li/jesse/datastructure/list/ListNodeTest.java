package li.jesse.datastructure.list;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.SinglyLinkedList;
import li.jesse.util.SinglyLinkedListUtil;
import org.junit.Test;

public class ListNodeTest {

    @Test
    public void testListNode() {
        ListNode listNode1 = new ListNode();
        listNode1.setValue(22);
        listNode1.display();
    }

    @Test
    public void testListNodes() {
        ListNode listNode1 = new ListNode(22, null);
        ListNode listNode2 = new ListNode(11, listNode1);

        SinglyLinkedList linkedList = new SinglyLinkedList(listNode2);

        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);
    }
}
