package com.company;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
        } else if (digits.length > 1) {
            digits[digits.length - 1]++;
            for (int i = digits.length - 1; i > 0; i--) {
                if (digits[i] == 10) {
                    digits[i] = 0;
                    digits[i - 1]++;
                }
            }
            if (digits[0] == 10) {
                int[] ans = new int[digits.length + 1];
                ans[0] = 1;
                ans[1] = 0;
                for (int i = 2; i < digits.length; i++) {
                    ans[i] = digits[i - 1];
                }
                return ans;
            }
        } else {
            return new int[]{1, 0};
        }
        return digits;
    }
}
