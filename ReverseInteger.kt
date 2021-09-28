package com.company

import java.lang.NumberFormatException

fun reverse(x: Int): Int {
    val string = x.toString()
    try {
        if (string[0] == '-') {
            return string.substring(1).reversed().toInt() * -1
        }
        return string.reversed().toInt()
    } catch (e: NumberFormatException) {
        return 0
    }
}