public class intersectionOfTwoLinkedList {
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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // if(headA.next==null || headB.next==null){
        //     if(headA==headB){
        //         return headA;
        //     }
        //     return null;
        // }
        ListNode currA = headA, currB = headB;
        while(currA != null && currB !=null){
            if(currA == currB){
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        if(currA==null && currB == null){
            return null;
        }
        if(currA == null){
            currA = headB;
            currB = currB.next;
            while(currB!=null){
                currB = currB.next;
                currA = currA.next;
            }
            currB = headA;
            currA = currA.next;
        }
        if(currB ==null){
            currB = headA;
            currA = currA.next;
            while(currA!=null){
                currB = currB.next;
                currA = currA.next;
            }
            currA = headB;
            currB = currB.next;
        }
        while(currA!=null && currB!=null){
            if(currA == currB){
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        return null;

    }
}
