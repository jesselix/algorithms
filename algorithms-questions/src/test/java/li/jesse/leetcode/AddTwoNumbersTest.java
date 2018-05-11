package li.jesse.leetcode;

import li.jesse.data.ListNode;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() {
        ListNode listNode1 = new ListNode(4, null);
        ListNode listNode2 = new ListNode(5, listNode1);
        ListNode listNode3 = new ListNode(6, listNode2);
        ListNode listNode4 = new ListNode(7, listNode3);

        ListNode listNode01 = new ListNode(4, null);
        ListNode listNode02 = new ListNode(5, listNode01);

        AddTwoNumbers.addTwoNumbers(listNode4, listNode02);
    }
}
