package li.jesse.question.leetcode;

import li.jesse.datastructure.list.linkedlist.ListNode;

/*
21. Merge Two Sorted Lists
Easy

Merge two sorted linked lists and return it as a new list.
The new list should be made by splicing together the nodes of the first two lists.
 */

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1), cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.getValue() < l2.getValue()) {
                cur.setNext(l1);;
                l1 = l1.getNext();
            } else {
                cur.setNext(l2);
                l2 = l2.getNext();
            }
            cur = cur.getNext();
        }
        cur.setNext((l1 != null) ? l1 : l2);
        return dummy.getNext();
    }
}

