import java.util.List;

public class oddEvenLinkedList {
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

        public ListNode oddEvenList(ListNode head) {
            if(head==null || head.next == null){
                return head;
            }
            ListNode curr = head;
            int counter = 1;
            while(curr.next!=null){
                counter++;
                curr = curr.next;
            }
            int line = Math.ceilDiv(counter,2);
            int a = 1;
            ListNode c2 = head;
            while(a<=line+1){
                c2 = c2.next;
                a++;
            }
            ListNode evenStart = c2;
            ListNode oddStart = head.next;
            int b = 0;
            while(evenStart!=null){
                if(b%2 ==0){
                    int temp = evenStart.val;
                    evenStart.val = oddStart.val;
                    oddStart.val = temp;

                }
                evenStart = evenStart.next;
                oddStart = oddStart.next;
                b++;
            }
            ListNode oddSwap = head.next;
            ListNode oddSwapNext = oddSwap.next;
            ListNode oddEnd = c2;
            while(oddSwapNext.next.next!=oddEnd){
                int temp = oddSwap.val;
                oddSwap.val = oddSwapNext.val;
                oddSwapNext.val = temp;
                oddSwap = oddSwap.next;
                oddSwapNext = oddSwapNext.next;
            }
            ListNode evenSwap = c2.next;
            ListNode evenSwapNext = c2.next.next;
            while(evenSwapNext!=null){
                int temp = evenSwap.val;
                evenSwap.val = evenSwapNext.val;
                evenSwapNext.val = temp;
                evenSwap = evenSwap.next;
                evenSwapNext = evenSwapNext.next;
            }
            return head;
        }
    }
}
