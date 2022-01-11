package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        RunningSum rs = new RunningSum();
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(rs.runningSum(arr)));
    }
}
