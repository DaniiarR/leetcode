package com.company;

public class CanJump {
    public boolean canJump(int[] nums) {
         int index = 0;
        while (index < nums.length - 1) {
            if (nums[index] == 0) return false;
            index += nums[index];
        }
        if (index == nums.length - 1) return true;
        return false;
    }
}
