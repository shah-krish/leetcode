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
            if(head == null || head.next==null){
                return head;
            }
            ListNode curr = head;
            int counter = 1;
            while(curr.next!=null){
                counter++;
                curr = curr.next;
            }
            int[] even = new int[counter/2];
            int[] odd = new int[counter - (counter/2)];

            int i = 0, j = 0, k =1;
            ListNode c2 = head;
            while(c2!=null){
                if(k%2!=0){
                    odd[i] = c2.val;
                    i++;
                }
                else{
                    even[j] = c2.val;
                    j++;
                }
                k++;
                c2 = c2.next;
            }

            ListNode c3 = head;
            int p = 0, q = 0;
            while(c3!=null){
                if(p<odd.length){
                    c3.val = odd[p];
                    p++;
                }
                else{
                    c3.val = even[q];
                    q++;
                }

                c3 = c3.next;
            }
            return head;
        }
    }
}
