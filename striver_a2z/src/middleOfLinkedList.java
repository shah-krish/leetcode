
public class middleOfLinkedList {
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
    public ListNode middleNode(ListNode head) {
        int counter = 0;
        ListNode curr = head;
        while(curr.next!=null){
            curr = curr.next;
            counter++;
        }
        int mid = Math.ceilDiv(counter,2);
        ListNode c2 = head;
        for(int i = 0; i<=mid;i++){
            c2=c2.next;
        }
        return c2;
    }
}
