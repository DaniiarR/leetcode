package com.company;


public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(3);
        l1.next = second;
        l1.next.next = third;

        ListNode l2 = new ListNode(5);
        ListNode sec = new ListNode(6);
        ListNode th = new ListNode(4);
        l2.next = sec;
        l2.next.next = th;

        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode res = atn.addTwoNumbers(l1, l2);
        while (res != null) {
            System.out.print(res.val);
            res = res.next;
        }
    }
}
