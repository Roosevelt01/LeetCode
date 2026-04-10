package LeetCode.Remove_Duplicates_from_Sorted_List;

public class Main {
    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ListNode current = n1;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }

        }

        ListNode temp = n1;

        while(temp != null){
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }

    }
}
