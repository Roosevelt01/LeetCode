package LeetCode.PalindromeLinkedList;

public class Exercise {
    public static class ListNode {
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
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode slow = n1;
        ListNode fast = n1;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current = slow;
        ListNode prev = null;

        while(current != null){
            ListNode next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        ListNode p1 = n1;
        ListNode p2 = prev;

        while(p2 != null){
            if(p1.val != p2.val){
                System.out.println("No es palindromo");
                return;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        System.out.println("Son palindromo");
    }
}

//Leetcode

class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) return true;

        // 1️⃣ Encontrar el middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2️⃣ Reverse desde slow (tu enfoque)
        ListNode current = slow;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // 3️⃣ Comparar
        ListNode p1 = head;
        ListNode p2 = prev;

        while (p2 != null) {
            if (p1.val != p2.val) return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}