public class deleteMiddleNodeLinkedList {
    public static void main(String[] args) {

    }
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
            val = 0;
            next = null;
        }

        ListNode(int data1) {
            val = data1;
            next = null;
        }

        ListNode(int data1, ListNode next1) {
            val = data1;
            next = next1;
        }
    }
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head.next;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}
