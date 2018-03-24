package li.jesse.question.leetcode;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.util.SinglyLinkedListUtil;

public class IntersectionOfTwoLinkedLists {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lenA = SinglyLinkedListUtil.getLength(headA);
        int lenB = SinglyLinkedListUtil.getLength(headB);

        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++)
                headA = headA.getNext();
        } else {
            for (int i = 0; i < lenB - lenA; i++)
                headB = headB.getNext();
        }
        while (headA != null && headB != null && headA != headB) {
            headA = headA.getNext();
            headB = headB.getNext();
        }

        return (headA != null && headB != null) ? headA : null;
    }

    public static ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA, b = headB;
        while (a != b) {
            a = (a != null) ? a.getNext() : headB;
            b = (b != null) ? b.getNext() : headA;
        }
        a.display();
        return a;
    }
}
