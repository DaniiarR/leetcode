package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MajorityElement {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;
        Set<Integer> set = new HashSet();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }
}
