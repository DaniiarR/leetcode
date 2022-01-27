package com.company;

public class ReverseLinkedListRecursive {
    public ListNode reverseList(ListNode curr) {
        // base case
        if(curr == null || curr.next == null) return curr;

        ListNode newHead = reverseList(curr.next);

        curr.next.next = curr;
        curr.next = null;

        return newHead;
    }
}
