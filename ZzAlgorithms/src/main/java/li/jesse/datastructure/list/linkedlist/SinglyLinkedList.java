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

    // ----- ----- ----- getter & setter ----- ----- -----
    public ListNode getHeadNode() {
        return headNode;
    }

    public void setHeadNode(ListNode firstNode) {
        this.headNode = firstNode;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
