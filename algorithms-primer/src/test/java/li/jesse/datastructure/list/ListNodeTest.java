package li.jesse.datastructure.list;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.singly.SinglyLinkedList;
import li.jesse.datastructure.list.linkedlist.singly.SinglyListNode;
import li.jesse.util.SinglyLinkedListUtil;
import org.junit.Test;

public class ListNodeTest {

    @Test
    public void testListNode() {
        SinglyListNode listNode1 = new SinglyListNode();
        listNode1.setValue(22);
        listNode1.display();
    }

    @Test
    public void testListNodes() {
        SinglyListNode listNode1 = new SinglyListNode(22, null);
        SinglyListNode listNode2 = new SinglyListNode(11, listNode1);

        SinglyLinkedList linkedList = new SinglyLinkedList(listNode2);

        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);
    }
}
