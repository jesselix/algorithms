package li.jesse.datastructure.list.linkedlist;

public class SinglyLinkedList {
    // head node
    private ListNode firstNode;
    // position of the node
    private int position;

    // ----- ----- ----- constructor ----- ----- -----
    public SinglyLinkedList() {
        this.firstNode = null;
    }

    // ----- ----- ----- getter & setter ----- ----- -----
    public ListNode getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(ListNode firstNode) {
        this.firstNode = firstNode;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
