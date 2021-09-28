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

fun twoSum(nums: IntArray, target: Int): IntArray {
    for ((index, firstUnusedNumber) in nums.withIndex()) {
        var innerIndex = firstUnusedNumber + 1
        for (i in firstUnusedNumber + 1 until nums.size) {
            val sum = firstUnusedNumber + i
            if (sum == target) {
                return intArrayOf(index, )
            }
        }
    }
}