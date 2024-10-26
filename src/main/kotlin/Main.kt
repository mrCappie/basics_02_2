package org.example

fun main() {
    val likes = 41
    val word = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"
    val message = "понравилось $likes $word"

    println(message)
}