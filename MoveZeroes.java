package com.company;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int insertPosition = 0;
        for (int i : nums) {
            if (i != 0) {
                nums[insertPosition++] = i;
            }
        }
        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }
    }
}
