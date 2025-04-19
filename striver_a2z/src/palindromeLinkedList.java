public class palindromeLinkedList {
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
        public boolean isPalindrome(ListNode head) {
            int counter = 0;
            ListNode curr = head;
            while(curr!=null){
                counter++;
                curr = curr.next;
            }
           // System.out.println(counter);
            if(counter<=0){
                return false;
            }
            counter = counter/2;
            ListNode mid = head;
            int i = 0;
            while(i<counter){
                mid = mid.next;
                i++;
            }
            ListNode rev = reverse(mid);
            while(rev != null) {
                if(head.val != rev.val) {
                    return false;
                }
                head = head.next;
                rev = rev.next;
            }
            return true;
        }

        public ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while(curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }
}


