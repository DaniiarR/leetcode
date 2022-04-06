package com.company;

import java.util.Arrays;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int mergedArrayIndex = 0;
        for (int i : nums1) {
            mergedArray[mergedArrayIndex++] = i;
        }
        for (int i : nums2) {
            mergedArray[mergedArrayIndex++] = i;
        }
        Arrays.sort(mergedArray);
        if (mergedArray.length % 2 != 0) {
            return mergedArray[mergedArray.length / 2];
        } else {
            return (double)(mergedArray[mergedArray.length / 2 - 1] + mergedArray[mergedArray.length /                  2]) / 2;
        }
    }
}
