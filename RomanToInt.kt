package com.company

fun main() {
    print(romanToInt("LVIII"))
}

fun romanToInt(s: String): Int {
    var i: Int = 0
    var number: Int = 0
    while (i < s.length) {
        when (s[i]) {
            'I' -> {
                try {
                    if (s[i + 1] == 'V') {
                        number += 4
                        i += 2
                    } else if (s[i + 1] == 'X') {
                        number += 9
                        i += 2
                    } else {
                        number++
                        i++
                    }
                } catch (e: StringIndexOutOfBoundsException) {
                    number++
                    i++
                }
            }
            'V' -> {
                number += 5
                i++
            }
            'X' -> {
                try {
                    if (s[i + 1] == 'L') {
                        number += 40
                        i += 2
                    } else if (s[i + 1] == 'C') {
                        number += 90
                        i += 2
                    } else {
                        number += 10
                        i++
                    }
                } catch (e: StringIndexOutOfBoundsException) {
                    number += 10
                    i++
                }
            }
            'L' -> {
                number += 50
                i++
            }
            'C' -> {
                try {
                    if (s[i + 1] == 'D') {
                        number += 400
                        i += 2
                    } else if (s[i + 1] == 'M') {
                        number += 900
                        i += 2
                    } else {
                        number += 100
                        i++
                    }
                } catch (e: StringIndexOutOfBoundsException) {
                    number += 100
                    i++
                }
            }
            'D' -> {
                number += 500
                i++
            }
            'M' -> {
                number += 1000
                i++
            }
        }
    }
    return number;
}