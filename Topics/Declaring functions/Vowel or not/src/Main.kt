// write your function here
const val VOWELS = "aiueo"

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}

fun isVowel(letter: Char): Boolean {
    return letter.lowercaseChar() in VOWELS
}