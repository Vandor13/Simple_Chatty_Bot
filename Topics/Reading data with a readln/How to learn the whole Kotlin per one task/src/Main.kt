const val NUMBER_OF_WORDS = 5

fun main() {
    // put your code here

    var text = ""
    for (i in 1..NUMBER_OF_WORDS) {
        if (i > 1) text += " "
        text += readln()
    }
    println(text)
}