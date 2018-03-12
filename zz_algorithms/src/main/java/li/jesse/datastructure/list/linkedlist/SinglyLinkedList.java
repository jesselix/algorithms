package li.jesse.datastructure.list.linkedlist;

public class SinglyLinkedList {
    // head node
    private ListNode headNode;
    // position of the node
    private int position;

    // ----- ----- ----- constructor ----- ----- -----
    public SinglyLinkedList() {
        this.headNode = null;
    }

    public SinglyLinkedList(ListNode headNode) {
        this.headNode = headNode;
    }

    // ----- ----- ----- getter & setter ----- ----- -----
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
