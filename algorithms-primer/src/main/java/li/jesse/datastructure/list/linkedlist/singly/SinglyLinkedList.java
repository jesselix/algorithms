package li.jesse.datastructure.list.linkedlist.singly;

import li.jesse.datastructure.list.linkedlist.ListNode;

public class SinglyLinkedList {
    // head node
    private ListNode headNode;
    // position of the node
    private int position = 0;

    // *********************** constructors ***********************
    public SinglyLinkedList() {
        this.headNode = null;
    }

    public SinglyLinkedList(ListNode headNode) {
        this.headNode = headNode;
    }

    // ******************** getters & setters *********************
    public ListNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(ListNode headNode) {
        this.headNode = headNode;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
