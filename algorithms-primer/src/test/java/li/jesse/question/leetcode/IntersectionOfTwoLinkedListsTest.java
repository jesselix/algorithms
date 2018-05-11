package li.jesse.question.leetcode;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.singly.SinglyLinkedList;
import li.jesse.datastructure.list.linkedlist.singly.SinglyListNode;
import org.junit.Test;

public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void testIntersectionOfTwoLinkedLists() {

        SinglyListNode node1 = new SinglyListNode(1);
        SinglyListNode node2 = new SinglyListNode(2);

        SinglyListNode node10 = new SinglyListNode(10);
        SinglyListNode node11 = new SinglyListNode(11);
        SinglyListNode node12 = new SinglyListNode(12);

        SinglyListNode node3 = new SinglyListNode(3);
        SinglyListNode node4 = new SinglyListNode(4);
        SinglyListNode node5 = new SinglyListNode(5);

        node1.setNext(node2);
        node2.setNext(node10);
        node10.setNext(node11);
        node11.setNext(node12);
        node12.setNext(null);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node10);

        SinglyLinkedList linkedList1 = new SinglyLinkedList(node1);
        SinglyLinkedList linkedList2 = new SinglyLinkedList(node3);

        SinglyListNode listNode = IntersectionOfTwoLinkedLists.getIntersectionNode(linkedList1.getHeadNode(), linkedList2.getHeadNode());
        System.out.println(listNode.getValue());
    }
}
