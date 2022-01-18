package com.company;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(head.val);
        ListNode p = dummyHead, q = head.next;
        while (q != null) {
            if (p.val != q.val) {
                p.next = q;
                p = p.next;
            }
            q = q.next;
        }
        p.next = null;
        return dummyHead;
    }
}
