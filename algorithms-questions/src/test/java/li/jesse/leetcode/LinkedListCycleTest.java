package li.jesse.leetcode;

import li.jesse.data.ListNode;
import org.junit.Test;

public class LinkedListCycleTest {

    @Test
    public void testLinkedListCycle() {
        ListNode listNode1 = new ListNode(12, null);
        ListNode listNode2 = new ListNode(11, listNode1);
        ListNode listNode3 = new ListNode(10, listNode2);
        ListNode listNode4 = new ListNode(10, listNode3);
        listNode1.next = listNode4;

        System.out.println(LinkedListCycle.hasCycle(listNode3));
    }
}
