package com.company;


public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(-10);
        ListNode second = new ListNode(-3);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(5);
        ListNode fifth = new ListNode(9);

        l1.next = second;
        l1.next.next = third;
        l1.next.next.next = fourth;
        l1.next.next.next.next = fifth;
//
        SortedArrayToBST rll = new SortedArrayToBST();

        TreeNode res = rll.sortedArrayToBST(new int[]{-10, -3, 0, 5, 9});



    }

}
