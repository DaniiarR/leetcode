package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];
        for (List list : buckets) {
            list = new ArrayList(); // can use either ArrayList or LinkedList
        }
        // Scattering phase
        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }
        // Sorting phase
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }
        // Merging phase
        int j= 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
        }
    }

    public static int hash(int value) {
        return value / 10;
    }
}
