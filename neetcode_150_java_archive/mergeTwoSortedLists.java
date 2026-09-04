//https://leetcode.com/problems/merge-two-sorted-lists/
public class mergeTwoSortedLists {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        ListNode one = list1, two = list2;
        ListNode temp = new ListNode();
        ListNode curr = temp;
        while(one!=null && two!=null){
            if(one.val > two.val){
                curr.next = two;
                two = two.next;
            }
            else{
                curr.next = one;
                one = one.next;
            }
            curr = curr.next;
        }
        if (one != null) {
            curr.next = one;
        }
        else{
            curr.next = two;
        }
        return temp.next;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
