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
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode  temp=curr.next;
            curr.next=prev;
            prev = curr;
            curr=temp;
        }
        return prev;
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
