import java.sql.SQLOutput;

public class nthNodeFromEndOfList {
    public static void main(String[] args) {

    }
     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        ListNode delayed = head;
        int counter = 0;
        while(counter<n){
            curr = curr.next;
            counter++;
        }
        while(curr==null){
            return head.next;
        }
        while(curr.next!=null){
            curr = curr.next;
            delayed = delayed.next;
        }
        delayed.next = delayed.next.next;
        return head;
    }
}
