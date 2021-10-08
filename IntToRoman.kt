package com.company

fun main() {
    println(intToRoman(58))
}

val map = hashMapOf(0 to "", 1 to "I", 2 to "II", 3 to "III", 4 to "IV", 5 to "V",
    6 to "VI", 7 to "VII", 8 to "VIII", 9 to "IX", 10 to "X", 50 to "L", 100 to "C", 500 to "D", 1000 to "M")

fun intToRoman(num: Int): String {
    val number = num.toString()
    return when (number.length) {
        1 -> map[num]!!
        2 -> solveTwoDigitNumber(number)
        3 -> solveThreeDigitNumber(number)
        4 -> solveFourDigitNumber(number)
        else -> "0"
    }
}

fun solveTwoDigitNumber(num: String): String {
    var number = ""
    when (num[0]) {
        '1' -> number += "X"
        '2' -> number += "XX"
        '3' -> number += "XXX"
        '4' -> number += "XL"
        '5' -> number += "L"
        '6' -> number += "LX"
        '7' -> number += "LXX"
        '8' -> number += "LXXX"
        '9' -> number += "XC"
    }
    number += map[Character.getNumericValue(num[1])]
    return number
}

fun solveThreeDigitNumber(num: String): String {
    var number = ""
    when (num[0]) {
        '1' -> number += "C"
        '2' -> number += "CC"
        '3' -> number += "CCC"
        '4' -> number += "CD"
        '5' -> number += "D"
        '6' -> number += "DC"
        '7' -> number += "DCC"
        '8' -> number += "DCCC"
        '9' -> number += "CM"
    }
    number += solveTwoDigitNumber(num.substring(1))
    return number
}

fun solveFourDigitNumber(num: String): String {
    var number = ""
    when (num[0]) {
        '1' -> number += "M"
        '2' -> number += "MM"
        '3' -> number += "MMM"
    }
    number += solveThreeDigitNumber(num.substring(1))
    return number
}