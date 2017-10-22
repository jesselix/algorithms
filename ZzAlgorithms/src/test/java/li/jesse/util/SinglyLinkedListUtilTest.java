package li.jesse.util;

import li.jesse.datastructure.list.linkedlist.SinglyLinkedList;
import org.junit.Test;

public class SinglyLinkedListUtilTest {
    @Test
    public void testSinglyLinkedListUtil() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        SinglyLinkedListUtil.addFirstNode(linkedList, 10);
        SinglyLinkedListUtil.addFirstNode(linkedList, 20);

        SinglyLinkedListUtil.printSinglyLinkedList(linkedList);
    }
}
