package com.company;


import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        ListNode second = new ListNode(2);
//        ListNode third = new ListNode(3);
//        ListNode fourth = new ListNode(4);
//        ListNode fifth = new ListNode(5);
//
//        l1.next = second;
//        l1.next.next = third;
//        l1.next.next.next = fourth;
//        l1.next.next.next.next = fifth;
////
//        ReverseLinkedListRecursive rll = new ReverseLinkedListRecursive();
//        ListNode res = rll.reverseList(l1);
//        while (res != null) {
//            System.out.print(res.val);
//            res = res.next;
//        }
        NumUniqueEmails nue = new NumUniqueEmails();
        System.out.println(nue.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }
}
