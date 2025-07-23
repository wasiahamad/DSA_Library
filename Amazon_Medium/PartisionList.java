// DSA_Library/Amazon_Medium/PartisionList.java
// Problem Statement:
// Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
// You should preserve the original relative order of the nodes in each of the two partitions.


package DSA_Library.Amazon_Medium;

public class PartisionList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Function to partition a linked list around a given value
    public static ListNode partition(ListNode head, int x) {
        // Base case
        if (head == null) {
            return null;
        }

        // Partition the list around the given value
        ListNode smaller = new ListNode(0);
        ListNode greater = new ListNode(0);
        ListNode smallerHead = smaller;
        ListNode greaterHead = greater;
        while (head != null) {
            if (head.val < x) {
                smaller.next = head;
                smaller = smaller.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }
        greater.next = null;
        smaller.next = greaterHead.next;
        return smallerHead.next;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        ListNode result = partition(head, 3);
        System.out.println("Partitioned list: " );
        printList(result);   

        // Output: 1 2 2 4 3 5
    }
}


