import java.util.ArrayList;

public class addTwoNumbersLL {
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

            public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
                ArrayList<Integer> list = new ArrayList<>();
                int carry = 0;

                ListNode c1 = l1;
                ListNode c2 = l2;



                while (c1 != null && c2 != null) {
                    list.add(((c1.val + c2.val) % 10) + carry);
                    if (c1.val + c2.val >= 10) {
                        carry = 1;
                    } else {
                        carry = 0;
                    }
                    c1 = c1.next;
                    c2 = c2.next;
                }
                while(c1!=null){
                    list.add(((c1.val + carry) % 10));
                    if (c1.val + carry >= 10) {
                        carry = 1;
                    } else {
                        carry = 0;
                    }
                    c1 = c1.next;
                }
                while(c2!=null){
                    list.add(((c2.val + carry) % 10));
                    if (c2.val + carry >= 10) {
                        carry = 1;
                    } else {
                        carry = 0;
                    }
                    c2 = c2.next;
                }
                if(c1==null && c2 ==null && carry == 1){
                    list.add(1);
                }
                ListNode ans = new ListNode();
                ListNode a1 = ans;
                ListNode a2 = null;
                for (int i = 0; i < list.size(); i++) {
                    a1.val = list.get(i);
                    a1.next = new ListNode();
                    a2 = a1;
                    a1 = a1.next;
                }
                a2.next = null;
                return ans;
            }
        }
}
