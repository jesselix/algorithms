package li.jesse.util;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.SinglyLinkedList;
import org.junit.Test;

public class SinglyLinkedListUtilTest {
    @Test
    public void testSinglyLinkedListUtil() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        SinglyLinkedListUtil.addHeadNode(linkedList, 100);
        SinglyLinkedListUtil.addHeadNode(linkedList, 200);

        SinglyLinkedListUtil.insertNode(linkedList, 2, 300);

        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);

        ListNode node1 = SinglyLinkedListUtil.findByPosition(linkedList, 0);
        System.out.println(node1.getValue());
    }

    @Test
    public void testBuildSinglyLinkedList() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        int[] array = {10, 12, 14, 16, 18, 20, 22};

//        SinglyLinkedListUtil.buildSinglyLinkedListFromArray(array);
        linkedList = SinglyLinkedListUtil.buildSinglyLinkedListFromArray(array);

        System.out.println(linkedList.getHeadNode().getValue());
        System.out.println(SinglyLinkedListUtil.getLength(linkedList.getHeadNode()));
        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);
    }
}
