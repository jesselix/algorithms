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

    public ListNode deleteNodeByPosition(int index) {
        ListNode current = firstNode;
        ListNode previous = firstNode;

        while ( position != index) {
            position++;
            previous = current;
            current = current. next;
        }

        if(current == firstNode) {
            firstNode = firstNode.next;
        } else {
            position = 0;
            previous.next = current. next;
        }

        return current;
    }

    public ListNode deleteByData( int data) {
        ListNode current = firstNode;
        ListNode previous = firstNode;
        while (current.val != data) {
            if (current. next == null) {
                return null;
            }
            previous = current;
            current = current. next;
        }
        if(current == firstNode) {
            firstNode = firstNode.next;
        } else {
            previous. next = current. next;
        }
        return current;
    }

    public void displayAllNodes() {
        ListNode current = firstNode;

        while (current != null) {
            current.display();
            current = current. next;
        }

        System. out.println();
    }

    public ListNode findByPos( int index) {
        ListNode current = firstNode;

        if ( position != index) {
            current = current. next;
            position++;
        }

        return current;
    }

    public ListNode findByData( int data) {
        ListNode current = firstNode;

        while (current.val != data) {
            if (current.next == null)
                return null;
            current = current. next;
        }

        return current;
    }
}
