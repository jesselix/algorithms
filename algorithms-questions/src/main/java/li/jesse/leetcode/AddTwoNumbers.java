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

//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        int x = 0, y = 0;
//        ListNode goNode1 = l1, goNode2 = l2;
//
//        int m = 1;
//        while (goNode1 != null) {
//            x = goNode1.value * m + x;
//            m = m * 10;
//            goNode1 = goNode1.next;
//        }
//
//        m = 1;
//        while (goNode2 != null) {
//            y = goNode2.value * m + y;
//            m = m * 10;
//            goNode2 = goNode2.next;
//        }
//
//        int z = x + y;
//        System.out.println(z);
//
//        int div = 1;
//        int length = 1;
//
//        while (z / div >= 10) {
//            div *= 10;
//            length++;
//        }
//
//        for (int i = 0; i < length; i++) {
//
//        }
//
//        return null;
//    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int d1 = l1 == null ? 0 : l1.value;
            int d2 = l2 == null ? 0 : l2.value;
            int sum = d1 + d2 + carry;
            carry = sum >= 10 ? 1 : 0;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (carry == 1)
            cur.next = new ListNode(1);
        return dummy.next;
    }

}
