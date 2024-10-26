package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val likes = 41
    val word = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"
    val message = "понравилось $likes $word"

    println(message)
}