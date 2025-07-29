import java.util.List;
import java.util.Stack;

public class reverseLinkedList {
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

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        if(curr == null || curr.next==null){
            return curr;
        }
        ListNode temp1 = head;
        ListNode next = curr.next;
        while(next!=null){
            ListNode temp = next.next;
            next.next = curr;
            curr = next;
            next= temp;
        }
        temp1.next = null;
        return curr;
    }
}























/*
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        Stack<Integer> s1 = new Stack();
        while(curr.next!=null){
            s1.push(curr.val);
            curr = curr.next;
        }

        ListNode c2 = head;
        while(!s1.isEmpty()){
            c2.val = s1.peek();
            s1.pop();
            c2 = c2.next;
        }
        return head;
    }
 */
