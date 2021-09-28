package com.company;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int firstNumberIndex = 0; firstNumberIndex < nums.length;
             firstNumberIndex++) {
            for (int i = firstNumberIndex + 1; i < nums.length; i++) {
                int sum = nums[firstNumberIndex] + nums[i];
                if (sum == target) {
                    return new int[]{firstNumberIndex, i};
                }
            }
        }
        return null;
    }

}
