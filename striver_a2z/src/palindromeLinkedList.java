import java.util.ArrayList;

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

        public boolean isPalindrome(ListNode head) {
            ArrayList<Integer> list = new ArrayList();
            ListNode curr = head;
            while (curr != null) {
                list.add(curr.val);
                curr = curr.next;
            }
            int last = list.size() - 1;
            int first = 0;
            while (first < last) {
                if (list.get(first) != list.get(last)) {
                    return false;
                }
                first++;
                last--;
            }
            return true;
        }
    }
}
