package com.company;

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 1 || n == 10) return true;
        if (n < 7) return false;
        while (true) {
            String number = Integer.toString(n);
            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += Math.pow(number.charAt(i) - '0', 2);
            }
            if (sum == 1 || sum == 10) {
                return true;
            } else if (sum < 7) {
                return false;
            } else {
                n = sum;
            }
        }
    }
}
