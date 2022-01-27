package com.company;

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int tortoise = 0, hare = 0;
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        int tortoise2 = 0;
        while (true) {
            tortoise = nums[tortoise];
            tortoise2 = nums[tortoise2];
            if (tortoise == tortoise2) {
                return tortoise;
            }
        }
    }
}
