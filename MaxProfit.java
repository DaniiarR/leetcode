package com.company;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pisn = 0; // profit if sold now
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) {
                lsf = prices[i];
            }
            pisn = prices[i] - lsf;
            if (pisn > op) {
                op = pisn;
            }
        }
        return op;
    }
}
