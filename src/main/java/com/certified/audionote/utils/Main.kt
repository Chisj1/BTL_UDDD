

package com.certified.audionote.utils

fun main() {
    val i = "00:08:18"
    val time = i.filter { it.isDigit() }.toLong()
    val sec = time % 60
    val minute = (time % 3600) / 60
    println("Time: $time, Minute: $minute, Second: $sec")
//    print(isEven(201))
}

fun isEven(number: Int): String {
    return when (number % 2) {
        0 -> "true"
        else -> "false"
    }
}