const val NUMBER_OF_VALUES = 3

fun main() {
    // put your code here
    var numbers = Array(NUMBER_OF_VALUES) { readln().toInt() }
    val firstNumber = numbers[0]
    numbers.sort()
    println(numbers[1] == firstNumber)
}