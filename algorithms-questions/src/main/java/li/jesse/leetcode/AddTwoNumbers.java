package li.jesse.leetcode;

import li.jesse.data.ListNode;

/*
2. Add Two Numbers
Medium

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int x = 0, y = 0;
        ListNode goNode1 = l1, goNode2 = l2;

        int m = 1;
        while (goNode1 != null) {
            x = goNode1.value * m + x;
            m = m * 10;
            goNode1 = goNode1.next;
        }

        m = 1;
        while (goNode2 != null) {
            y = goNode2.value * m + y;
            m = m * 10;
            goNode2 = goNode2.next;
        }

        System.out.println(x + y);

        return null;
    }
}
