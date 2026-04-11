//https://leetcode.com/problems/reverse-linked-list/
public class reverseLinkedList {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode end = head;
        ListNode curr = head;
        if(curr == null || curr.next==null){
            return curr;
        }
        ListNode next = curr.next;
        while(next.next!=null){
            ListNode temp = next.next;
            next.next = curr;
            curr = next;
            next = temp;
        }
        next.next = curr;
        end.next = null;
        return next;
    }
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
