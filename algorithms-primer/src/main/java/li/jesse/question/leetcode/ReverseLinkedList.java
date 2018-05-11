package li.jesse.question.leetcode;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.singly.SinglyListNode;

/*
206. Reverse Linked List
Easy

Reverse a singly linked list.

Hint:
A linked list can be reversed either iteratively or recursively. Could you implement both?

 */
public class ReverseLinkedList {
    public static SinglyListNode reverseList(SinglyListNode head) {
        if(head == null || head.getNext() == null) return head;
        SinglyListNode p1 = head;
        SinglyListNode p2 = p1.getNext();
        while(p2 != null){
            SinglyListNode tmp = p2.getNext();
            p2.setNext(p1);
            p1 = p2;
            p2 = tmp;
        }
        head.setNext(null);
        return p1;
    }
}
