package com.company

fun main(args: Array<String>) {

    val array = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    println("Unsorted array: ")
    printArray(array)
    // outer loop is responsible for decreasing the amount of
    // unsorted elements that the inner loop has to go through
    for (lastUnsortedIndex in array.size - 1 downTo 1 step 1) {
        // each time assume the biggest element is at index 0
        var largestElementIndex = 0;
        // loop through all unsorted elements and find the index of the biggest one
        for (i in 1..lastUnsortedIndex) {
            if (array[i] > array[largestElementIndex]) {
                largestElementIndex = i
            }
        }
        // swap the found element with lastUnsortedIndex
        swap(array, largestElementIndex, lastUnsortedIndex)
    }
    println("Sorted array: ")
    printArray(array)
}

