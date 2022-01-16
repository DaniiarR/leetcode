package com.company;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            for (int p = i + 1; p < nums.length; p++) {
                sum += nums[p];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
