package com.company;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if (head.next == null) return head;
        ListNode dummyHead = new ListNode();
        dummyHead.val = head.val;
        ListNode p = head, q = head.next, curr = dummyHead;
        while (q != null) {
            if (p.val != q.val) {
                curr.next = q;
                p = p.next;
                curr = curr.next;
            }
            q = q.next;


        }
        return dummyHead;
    }
}
