package com.company

fun main(args: Array<String>) {
    val array = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    println("Unsorted array: ")
    printArray(array)
    mergeSort(array, 0, array.size)
    println("Sorted array")
    printArray(array)
}

fun mergeSort(input: IntArray, start: Int, end: Int) {
    // if end - start < 2, we have already separated everything into sorted 1 element arrays
    if (end - start < 2) {
        return
    }
    // we divide the array into two parts and sort them recursively
    val mid = (start + end) / 2
    mergeSort(input, start, mid)
    mergeSort(input, mid, end)
    merge(input, start, mid, end)
}

fun merge(input: IntArray, start: Int, mid: Int, end: Int) {
    // if the last element of left array is less than the 1st element of right array
    // simply return because it means both arrays are sorted
    if (input[mid - 1] < input[mid]) {
        return
    }

    var i = start
    var j = mid
    var tempIndex = 0
    val temp = IntArray(end - start) {0}
    // loop until we've reached the ends of each partition(left and right)
    while (i < mid && j < end) {
        // if element in left array is less than or equal to the element in the right array
        // assign that value(input[i++] to temp[tempIndex++]
        // or assign input[j++] if greater
        temp[tempIndex++] = if (input[i] <= input[j]) input[i++] else input[j++]
    }
    // copy the remainders that might be left as last elements in left array (beginning from start + tempIndex)
    System.arraycopy(input, i, input, start + tempIndex, mid - i);
    // copy the sorted elements into input array (to the beginning)
    System.arraycopy(temp, 0, input, start, tempIndex)
}