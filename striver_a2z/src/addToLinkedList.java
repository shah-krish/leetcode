public class addToLinkedList {
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

    class Solution {
        public ListNode insertAtHead(ListNode head, int X) {
            ListNode first = new ListNode(X);
            if (head == null) {
                head = first;
            } else {
                first.next = head;
                head = first;
            }
            return head;
        }
    }
}
