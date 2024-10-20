package org.importantEasy;

class MergeSortedLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null & l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        return dummy.next;
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
public class MergeTwoSortedLinkedListMain {
    public static void main (String[] args) {
        MergeSortedLinkedList mergeSortedLinkedList = new MergeSortedLinkedList();
        // Create two sorted linked lists
        MergeSortedLinkedList.ListNode l1 = new MergeSortedLinkedList.ListNode(1);
        l1.next = new MergeSortedLinkedList.ListNode(3);
        l1.next.next = new MergeSortedLinkedList.ListNode(5);
        MergeSortedLinkedList.ListNode l2 = new MergeSortedLinkedList.ListNode(2);
        l2.next = new MergeSortedLinkedList.ListNode(4);
        l2.next.next = new MergeSortedLinkedList.ListNode(6);

        // Merge the two sorted linked lists
        MergeSortedLinkedList.ListNode mergedList = mergeSortedLinkedList.mergeList(l1, l2);
        // Print the merged linked list
        System.out.print("Merged Sorted Linked List: ");
        mergeSortedLinkedList.printList(mergedList);
    }
}
