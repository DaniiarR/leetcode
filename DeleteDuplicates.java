package com.company;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head, q = head.next;
        while (p.next != null && q.next != null) {
            if (p.val == q.val) {
                p.next = q.next;
                q = p.next;
            } else {
                p = p.next;
                q = q.next;
            }
        }
        return head;
    }
}
