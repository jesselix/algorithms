//package li.jesse.leetcode;
//
//import li.jesse.datastructure.list.linkedlist.ListNode;
//import li.jesse.datastructure.list.linkedlist.SinglyLinkedList;
//import org.junit.Test;
//
//public class IntersectionOfTwoLinkedListsTest {
//
//    @Test
//    public void testIntersectionOfTwoLinkedLists() {
//
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//
//        ListNode node10 = new ListNode(10);
//        ListNode node11 = new ListNode(11);
//        ListNode node12 = new ListNode(12);
//
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//
//        node1.setNext(node2);
//        node2.setNext(node10);
//        node10.setNext(node11);
//        node11.setNext(node12);
//        node12.setNext(null);
//        node3.setNext(node4);
//        node4.setNext(node5);
//        node5.setNext(node10);
//
//        SinglyLinkedList linkedList1 = new SinglyLinkedList(node1);
//        SinglyLinkedList linkedList2 = new SinglyLinkedList(node3);
//
//        ListNode listNode = IntersectionOfTwoLinkedLists.getIntersectionNode(linkedList1.getHeadNode(), linkedList2.getHeadNode());
//        System.out.println(listNode.getValue());
//    }
//}
