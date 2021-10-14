package com.company

fun main() {
    val array = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    println("Unsorted array: ")
    printArray(array)
    quickSort(array, 0, array.size - 1)
    println("Sorted array: ")
    printArray(array)
}

fun quickSort(arr: IntArray, start: Int, end: Int) {
    // start >= end means start we've come to sorted one-element array
    if (start >= end) {
        return
    }
    val pivot = partition(arr, start, end)
    quickSort(arr, start, pivot - 1)
    quickSort(arr, pivot + 1, end)
}

fun partition(arr: IntArray, start: Int, end: Int) : Int {
    // last element is to be the pivot
    val pivot = arr[end]
    var i = start - 1
    var j = start
    while (j < end) {
        if (arr[j] < pivot) {
            // in this case we increase the i and swap arr[i] with arr[j]
            i++
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
        }
        j++
    }
    // when everything is done we need to put the pivot element in the middle of array
    val temp = arr[i + 1]
    arr[i + 1] = arr[end]
    arr[end] = temp
    return i + 1
}