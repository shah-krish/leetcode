//https://leetcode.com/problems/linked-list-cycle/
public class linkedListCycle {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode curr = head;
        ListNode fast = head.next;
        while(fast.next != null && fast.next.next!=null){
            if(curr==fast){
                return true;
            }
            fast = fast.next.next;
            curr = curr.next;
        }
        return false;
    }
          public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
