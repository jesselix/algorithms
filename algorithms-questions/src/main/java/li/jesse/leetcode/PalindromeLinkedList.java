package li.jesse.leetcode;

import li.jesse.data.ListNode;

import java.util.Stack;

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
