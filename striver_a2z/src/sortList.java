import java.util.ArrayList;

public class sortList {
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        return merge(l1, l2);
    }
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode ans = new ListNode(0);
        ListNode a1 = ans;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                a1.next = l1;
                l1 = l1.next;
            }
            else{
                a1.next = l2;
                l2 = l2.next;
            }
            a1 = a1.next;
        }
        if(l1!=null){
            a1.next = l1;
        }
        if(l2!=null){
            a1.next=  l2;
        }
        return ans.next;
    }
}
