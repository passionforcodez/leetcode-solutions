package org.importantEasy;

class ReverseLLSolution {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class ReverseLinkedList {
    public static void main (String[] args) {
        ReverseLLSolution reverseLLSolution = new ReverseLLSolution();

        ReverseLLSolution.ListNode head = new ReverseLLSolution.ListNode(1);
        head.next = new ReverseLLSolution.ListNode(2);
        head.next.next = new ReverseLLSolution.ListNode(3);
        head.next.next.next = new ReverseLLSolution.ListNode(4);
        head.next.next.next.next = new ReverseLLSolution.ListNode(5);

        ReverseLLSolution.ListNode reverseHead = reverseLLSolution.reverseList(head);
        System.out.println("Reverse Linked List: ");
        reverseLLSolution.printList(reverseHead);
    }
}
