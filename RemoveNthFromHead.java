package com.company;

public class RemoveNthFromHead {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        if (head.next == null) return null;
        int length = 1;
        ListNode p = head;
        while (p.next != null) {
            length++;
            p = p.next;
        }
        int index = 1, targetIndex = length - n - 1;
        ListNode newHead = head;
        ListNode curr;
        newHead.val = head.val;
        p = head.next;
        while (index < targetIndex) {
            p = p.next;
            index++;
        }
        curr = p;
        curr.next = p.next.next;
        return newHead;
    }
}
