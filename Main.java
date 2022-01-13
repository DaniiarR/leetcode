package com.company;


public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(4);
        l1.next = second;
        l1.next.next = third;

        ListNode l2 = new ListNode(1);
        ListNode sec = new ListNode(3);
        ListNode th = new ListNode(4);
        l2.next = sec;
        l2.next.next = th;

        MergeTwoLists atn = new MergeTwoLists();
        ListNode res = atn.mergeTwoLists(l1, l2);
        while (res != null) {
            System.out.print(res.val);
            res = res.next;
        }
    }
}
