package com.company

fun main(args: Array<String>) {
    val array = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    println("Unsorted array: ")
    printArray(array)
    // outer loop is responsible for decreasing the amount of
    // unsorted elements that the inner loop has to go through
    for (lastUnknownIndex in array.size - 1 downTo 1 step 1) {
        // loop through all unsorted elements
        for (i in 0 until lastUnknownIndex) {
            // if the adjacent elements is bigger, swap
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1)
            }
        }
    }
    println("Sorted array: ")
    printArray(array)
}

fun swap(array: IntArray, i: Int, j: Int) {
    if (array[i] == array[j]) {
        return
    }
    val temp = array[i]
    array[i] = array[j]
    array[j] = temp
}

fun printArray(array: IntArray) {
    for (i in array) {
        print(i.toString() + ' ');
    }
    println()
}