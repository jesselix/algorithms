package li.jesse.data;

// Definition for singly-linked list
public class ListNode {
     public int value;
     public ListNode next;

     public ListNode(int x) {
        value = x;
        next = null;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}
