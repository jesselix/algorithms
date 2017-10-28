package li.jesse.util;

import li.jesse.datastructure.list.linkedlist.ListNode;
import li.jesse.datastructure.list.linkedlist.SinglyLinkedList;

public class SinglyLinkedListUtil {

    public static SinglyLinkedList buildSinglyLinkedListFromArray(int[] array) {

        ListNode[] array2 = new ListNode[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            ListNode tempNode = new ListNode();
            tempNode.setValue(array[i]);

            if (i == array.length - 1) {
                tempNode.setNext(null);
            }
            else {
                tempNode.setNext(array2[i + 1]);
            }

            array2[i] = tempNode;
        }

        ListNode headNode = array2[0];
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.setHeadNode(headNode);

        return linkedList;
    }

    /**
     * print elements of the linked List
     * @param linkedList
     */
    public static void printSinglyLinkedList(SinglyLinkedList linkedList) {
        ListNode currentNode = linkedList.getHeadNode();

        while (currentNode != null) {
            currentNode.display();
            currentNode = currentNode.getNext();
        }

        System.out.println();
    }

    /**
     * add head node
     * @param linkedList
     * @param value
     */
    public static void addHeadNode(SinglyLinkedList linkedList, int value) {
        ListNode node = new ListNode(value);
        node.setNext(linkedList.getHeadNode());
        linkedList.setHeadNode(node);
    }

    /**
     * delete first node
     * @param linkedList
     * @return
     */
    public static ListNode deleteHeadNode(SinglyLinkedList linkedList) {
        ListNode tempNode = linkedList.getHeadNode();
        linkedList.setHeadNode(tempNode.getNext());
        return tempNode;
    }

    /**
     * insert node
     * @param linkedList
     * @param index
     * @param value
     */
    public static void insertNode(SinglyLinkedList linkedList, int index, int value) {
        ListNode node = new ListNode(value);
        ListNode currentNode = linkedList.getHeadNode();
        ListNode previousNode = linkedList.getHeadNode();

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
    public static ListNode findByPosition(SinglyLinkedList linkedList, int index) {
        ListNode currentNode = linkedList.getHeadNode();

        while (linkedList.getPosition() != index) {
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
    public static ListNode findByValue(SinglyLinkedList linkedList, int value) {
        ListNode currentNode = linkedList.getHeadNode();

        while (currentNode.getValue() != value) {
            if (currentNode.getNext() == null)
                return null;
            currentNode = currentNode.getNext();
        }

        return currentNode;
    }

    /**
     * get length of the linked list from head node
     * @param head
     * @return
     */
    public static int getLength(ListNode head) {
        int length = 0;

        while (head != null) {
            length++;
            head = head.getNext();
        }

        return length;
    }
}
