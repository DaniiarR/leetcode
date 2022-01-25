package com.company;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] backup = Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        int startNum = 0;
        int endNum = 0;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                startNum = nums[start];
                endNum = nums[end];
                break;
            }
        }
        int[] ans = new int[2];
        for (int i = 0; i < backup.length; i++) {
            if (backup[i] == startNum) {
                ans[0] = i;
                break;
            }
        }
        for (int i = backup.length - 1; i >= 0; i--) {
            if (backup[i] == endNum) {
                ans[1] = i;
                break;
            }
        }
        return ans;
    }

}
