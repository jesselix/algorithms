package li.jesse.datastructure.list.linkedlist;

public class ListNode {
    // value of the node
    private int value;
    // pointer to the next node
    private ListNode next;

    // ----- ----- ----- constructor ----- ----- -----
    public ListNode() {

    }

    public ListNode(int x) {
        value = x;
    }

    // ----- ----- ----- getter & setter ----- ----- -----
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void display() {
        System. out.print( value + " ");
    }
}