package com.company;

import java.util.Arrays;

public class Search2dArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        if (matrix.length == 1) {
            return Arrays.binarySearch(matrix[0], target) >= 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (target > matrix[i][0]) {
                row++;
            } else if (target == matrix[i][0]) {
                return true;
            } else {
                row--;
                break;
            }
        }
        if (row == matrix.length) row--;
        if (row == -1 || row >= matrix.length) return false;
        return Arrays.binarySearch(matrix[row], target) >= 0;
    }
}
