package LeetCode.Merge;

public class Exercise {
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode current = n1;
        ListNode prev = null;
        ListNode next = n1.next;

        while(current != null){
            next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        ListNode newHead = prev;

        while(newHead != null){
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}