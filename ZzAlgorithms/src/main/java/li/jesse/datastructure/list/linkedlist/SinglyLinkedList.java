package li.jesse.datastructure.list.linkedlist;

public class SinglyLinkedList {
    private ListNode firstNode;
    private int position;

    public SinglyLinkedList() {
        this.firstNode = null;
    }

    public void addFirstNode(int val) {
        ListNode node = new ListNode(val);
        node.next = firstNode;
        firstNode = node;
    }

    public ListNode deleteFirstNode() {
        ListNode tempNode = firstNode;
        firstNode = tempNode.next;
        return tempNode;
    }

    public void insertNode(int index, int val) {
        ListNode node = new ListNode(val);
        ListNode current = firstNode;
        ListNode previous = firstNode;
        while ( position != index) {
            previous = current;
            current = current. next;
            position++;
        }
        node. next = current;
        previous. next = node;
        position = 0;
    }
}
