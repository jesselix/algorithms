package li.jesse.question.leetcode;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.singly.SinglyListNode;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoSortedLists() {
        SinglyListNode a1 = new SinglyListNode(1);
        SinglyListNode a2 = new SinglyListNode(2);
        a1.setNext(a2);

        MergeTwoSortedLists.mergeTwoLists(a1, a2);
    }
}
