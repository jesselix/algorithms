package li.jesse.question.leetcode;

/*
83. Remove Duplicates from Sorted List
Easy

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 */

public class RemoveDuplicatesFromSortedList
{
    public static ListNode deleteDuplicates(ListNode head)
    {
        if(head == null)
            return head;
        ListNode pre = head;
        ListNode cur = head.next;
        while(cur!=null)
        {
            if(cur.val == pre.val)
                pre.next = cur.next;
            else
                pre = cur;
            cur = cur.next;
        }
        return head;
    }
}

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
