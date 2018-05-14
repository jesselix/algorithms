package li.jesse.leetcode;

import li.jesse.data.ListNode;

import java.util.Stack;

/*
234. Palindrome Linked List
Easy

Given a singly linked list, determine if it is a palindrome.

Example 1:
Input: 1->2
Output: false

Example 2:
Input: 1->2->2->1
Output: true

Follow up:
Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode slow = head, fast = head;

        Stack<Integer> s = new Stack<>();

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            s.push(slow.value);
        }

        if (fast.next != null)
            s.pop();

        while (slow.next != null) {
            slow = slow.next;
            Integer temp = s.peek();
            s.pop();
            if (temp != slow.value)
                return false;
        }

        return true;
    }
}
