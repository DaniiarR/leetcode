package com.company;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode dummyHead = new ListNode();
        ListNode p = list1, q = list2, curr = dummyHead;
        while (p != null || q != null) {
            if (p == null) {
                curr.next = new ListNode(q.val);
                q = q.next;
                curr = curr.next;
            } else if (q == null) {
                curr.next = new ListNode(p.val);
                p = p.next;
                curr = curr.next;
            } else if (q.val > p.val) {
                curr.next = new ListNode(p.val);
                p = p.next;
                curr = curr.next;
            } else if (p.val > q.val) {
                curr.next = new ListNode(q.val);
                q = q.next;
                curr = curr.next;
            } else {
                curr.next = new ListNode(p.val);
                curr = curr.next;
                curr.next = new ListNode(q.val);
                curr = curr.next;
                p = p.next;
                q = q.next;
            }
        }
        return dummyHead.next;
    }
}
