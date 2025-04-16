import java.util.HashSet;

public class linkedListCycle2 {
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
        public ListNode detectCycle(ListNode head) {
            HashSet<ListNode> visited = new HashSet<>();
            ListNode current = head;

            while (current != null) {
                if (visited.contains(current)) {
                    return current;
                }
                visited.add(current);
                current = current.next;
            }

            return null;
        }
    }
}
