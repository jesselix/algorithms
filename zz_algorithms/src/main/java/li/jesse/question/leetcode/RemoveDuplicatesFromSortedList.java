package li.jesse.question.leetcode;

import li.jesse.datastructure.list.linkedlist.ListNode;

/*
83. Remove Duplicates from Sorted List
Easy

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;
        ListNode pre = head;
        ListNode cur = head.getNext();

        while(cur!=null) {
            if(cur.getValue() == pre.getValue())
                pre.setNext(cur.getNext());
            else
                pre = cur;
            cur = cur.getNext();
        }
        return head;
    }
}
