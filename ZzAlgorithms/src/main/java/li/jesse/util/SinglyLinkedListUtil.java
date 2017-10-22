package li.jesse.util;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.SinglyLinkedList;

public class SinglyLinkedListUtil {

    public static void printSinglyLinkedList(SinglyLinkedList linkedList) {
        ListNode currentNode = linkedList.getFirstNode();

        while (currentNode != null) {
            currentNode.display();
            currentNode = currentNode.getNext();
        }

        System.out.println();
    }

    /**
     * add first node
     * @param linkedList
     * @param value
     */
    public static void addFirstNode(SinglyLinkedList linkedList, int value) {
        ListNode node = new ListNode(value);
        node.setNext(linkedList.getFirstNode());
        linkedList.setFirstNode(node);
    }

    /**
     * delete first node
     * @param linkedList
     * @return
     */
    public ListNode deleteFirstNode(SinglyLinkedList linkedList) {
        ListNode tempNode = linkedList.getFirstNode();
        linkedList.setFirstNode(tempNode.getNext());
        return tempNode;
    }

    /**
     * insert node
     * @param linkedList
     * @param index
     * @param value
     */
    public void insertNode(SinglyLinkedList linkedList, int index, int value) {
        ListNode node = new ListNode(value);
        ListNode currentNode = linkedList.getFirstNode();
        ListNode previousNode = linkedList.getFirstNode();

        while (linkedList.getPosition() != index) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
            linkedList.setPosition(linkedList.getPosition() + 1);
        }

        node.setNext(currentNode);
        previousNode.setNext(node);
        linkedList.setPosition(0);
    }

    /**
     * find node by position
     * @param linkedList
     * @param index
     * @return
     */
    public ListNode findByPosition(SinglyLinkedList linkedList, int index) {
        ListNode currentNode = linkedList.getFirstNode();

        if (linkedList.getPosition() != index) {
            currentNode = currentNode.getNext();
            linkedList.setPosition(linkedList.getPosition() + 1);
        }

        return currentNode;
    }

    /**
     * find node by value
     * @param linkedList
     * @param value
     * @return
     */
    public ListNode findByValue(SinglyLinkedList linkedList, int value) {
        ListNode currentNode = linkedList.getFirstNode();

        while (currentNode.getValue() != value) {
            if (currentNode.getNext() == null)
                return null;
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }
}
