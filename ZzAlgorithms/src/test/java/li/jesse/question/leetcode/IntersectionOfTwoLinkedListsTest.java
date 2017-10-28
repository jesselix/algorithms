package li.jesse.question.leetcode;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.SinglyLinkedList;
import li.jesse.util.SinglyLinkedListUtil;
import org.junit.Test;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void testIntersectionOfTwoLinkedLists() {
        ListNode node12 = new ListNode(12);
        node12.setNext(null);
        ListNode node11 = new ListNode(11);
        node11.setNext(node12);
        ListNode node10 = new ListNode(10);
        node10.setNext(node11);
        ListNode node2 = new ListNode(2);
        node2.setNext(node10);
        ListNode node1 = new ListNode(1);
        node1.setNext(node2);
        ListNode node4 = new ListNode(4);
        node4.setNext(node10);
        ListNode node3 = new ListNode(3);
        node3.setNext(node4);

        SinglyLinkedList linkedList1 = new SinglyLinkedList(node1);
        SinglyLinkedList linkedList2 = new SinglyLinkedList(node3);

        ListNode listNode = IntersectionOfTwoLinkedLists.getIntersectionNode(linkedList1.getHeadNode(), linkedList2.getHeadNode());
        System.out.println(listNode.getValue());
    }
}
