package com.company

fun main() {
    val array = intArrayOf(2, 5, 9, 8, 2, 8, 7, 10, 4, 3)
    println("Unsorted array: ")
    printArray(array)
    countingSort(array, 1, 10)
    println("Sorted array: ")
    printArray(array)
}

fun countingSort(arr: IntArray, min: Int, max: Int) {
    // size of countArray is calculated as (max - min + 1)
    // example: (max - min + 1) = 10 - 1 + 1 = 10 (arr.length = 10 as well)
    val countArray = IntArray(max - min + 1)

    arr.forEach {
        // ex: it = 5 -> 5 - 1 = 4
        // (increment counter at index 4 because that's where 5 is located in list between 1..10)
        countArray[it - min]++
    }
    var j = 0;
    for (i in min..max) {
        // loop while the counter is greater than 0
        while (countArray[i - min] > 0) {
            arr[j++] = i
            countArray[i - min]--
        }
    }
}