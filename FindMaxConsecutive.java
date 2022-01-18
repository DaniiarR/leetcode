package com.company;

public class FindMaxConsecutive {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i : nums) {
            if (i == 1) {
                count++;
            } else {
                result = Math.max(result, count);
                count = 0;
            }
        }

        return Math.max(result, count);
    }
}
