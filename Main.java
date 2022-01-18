package com.company;


public class Main {

    public static void main(String[] args) {
//        ListNode l1 = new ListNode(1);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(2);
//        ListNode fourth = new ListNode(3);
//        ListNode fifth = new ListNode(3);
//
//        l1.next = second;
//        l1.next.next = third;
//        l1.next.next.next = fourth;
//        l1.next.next.next.next = fifth;
//
//        DeleteDuplicates dd = new DeleteDuplicates();
//        ListNode res = dd.deleteDuplicates(l1);
//        while (res != null) {
//            System.out.print(res.val);
//            res = res.next;
//        }
        FindMaxConsecutive fmc = new FindMaxConsecutive();
        int[] arr = {1,1,0,1,1,1};
        System.out.println(fmc.findMaxConsecutiveOnes(arr));
    }
}
