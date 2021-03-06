package com.company

fun main(args: Array<String>) {
    val array = intArrayOf(20, 35, -15, 7, 55, 1, -22)
    println("Unsorted array: ")
    printArray(array)

    for (firstUnsortedIndex in 1 until array.size) {
        var newElement: Int = array[firstUnsortedIndex]
        var i: Int = firstUnsortedIndex
        while (i > 0 && array[i - 1] > newElement) {
            array[i] = array[i - 1]
            i--
        }
        array[i] = newElement
    }
    println("Sorted array")
    printArray(array)
}
