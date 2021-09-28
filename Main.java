package com.company;

public class Main {

    public static void main(String[] args) {
//	    int[] array = {20, 35, -17, 7, 55, 1, -22};
//        for (int lastUnsortedIndex = array.length)
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = i;
        i = j;
        j = temp;
    }
}
