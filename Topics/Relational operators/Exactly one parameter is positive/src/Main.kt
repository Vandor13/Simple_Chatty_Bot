const val NUMBER_OF_VALUES = 3

fun main() {
    // put your code here
    val numbers = Array(NUMBER_OF_VALUES) { readln().toInt() }
    var numberOfPositiveNumbers = 0
    for (number in numbers) {
        if (number > 0) numberOfPositiveNumbers++
    }
    println(numberOfPositiveNumbers == 1)
}