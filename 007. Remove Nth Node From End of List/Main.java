package LeetCode.Remove_Nth_Node_From_End_of_List;

public class Main {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next =null;
        }
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        ListNode dummy = new ListNode(0);
        dummy.next = list;

        ListNode slow = dummy;
        ListNode fast = dummy;
        int n = 2;

        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        ListNode current = dummy.next;

        while(current != null){
            System.out.print(current.val + (current.next != null? " -> " :""));
            current = current.next;
        }
    }
}