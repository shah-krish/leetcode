//https://leetcode.com/problems/reorder-list/description/
import java.util.Stack;

public class reorderList {
    public static void main(String[] args) {

    }
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode curr = head;
        int total = 0;
        ListNode count = head;
        while(count!=null){
            total++;
            count = count.next;
        }
        int half = Math.ceilDiv(total, 2);
        int a = 0;
        while(a!=half-1){
            curr = curr.next;
            a++;
        }
        ListNode t = curr.next;
        curr.next = null;
        curr = t;
        Stack<ListNode> s1 = new Stack();
        while(curr!=null){
            s1.push(curr);
            curr=curr.next;
        }
        ListNode end = head;
        while(!s1.isEmpty()){
            ListNode temp = end.next;
            end.next = s1.peek();
            s1.peek().next = temp;
            s1.pop();
            end = temp;
        }
        return;
    }
              public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
